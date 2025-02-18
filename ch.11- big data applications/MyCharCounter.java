// ex 11.2; java hadoop character count program
import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;

//mapper class
class MyMapper extends MapReduceBase implements 
  public void map(LongWritable key, Text value, OutputCollector<Text,IntWritable> output,Reporter reporter) throws IOException {
    String line = value.toString();
    String tokenizer = line.split("");
    for(String SingleChar : tokenizer) {
      Text charKey = new Text(SingleChar);
      IntWritable One = new IntWritable(1);
      output.collect(charKey,One);
    }
}

public class MyCharCounter {
  public static void main(String[] args) throws IOException {
    JobConf conf = new JobConf(MyCharCounter.class);
    conf.setJobName("character count");
    conf.setOutputKeyClass(Text.class);
    conf.setOutputValueClass(IntWritable.class);
    conf.setMapperClass(MyMapper.class);
    conf.setCombinerClass(MyReducer.class);
    conf.setReducerClass(MyReducer.class);
    conf.setInputFormat(TextInputFormat.class);
    conf.setOutputFormat(TextOutputFormat.class);
    FileInputFormat.setInputPaths(conf, new Path(args[0]));
    FileOutputFormat.setOutputPath(conf, new Path(args[1]));
    JobClient.runJob(conf);
  }
}
