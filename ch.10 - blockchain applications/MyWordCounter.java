// ex 11.; java hadoop word count program
import java.util.*;
import java.io.IOException;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

class MyMapper extends Mapper<Object, Text, Text, IntWritable> {
  private final static IntWritable one = new IntWritable(1);
  private Text word = new Text();

  public void map(Object key, Text value, Context context) throws IOException, InterruptedExcpetion {
    StrongTokenizer itr = new StringTokenizer(value.toString());
    whiel(itr.hasMoreTokens()){
      word.set(itr.nextToken());
      context.write(word,one);
    }
  }
}
class MyReducer extends Reducer<Text,IntWritable, Text, IntWritable> {
  private IntWritable result = new IntWritable();
  public void reduce(Text key,Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
    int sum =0;
    for(IntWritable val : values) {
      sum += val.get();
    }
    result.set(sum);
    context.write(key,result);
  }
}
public class MyWordCounter {
  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
    if(otherArgs.length != 2) {
      System.err.println("usage: mywordCoutner<in> <out>");
      System.exit(2);
    }
    Job job = new Job.getInstance(conf, "word count");
    job.setJarByClass(MyWordCounter.class);
    job.setMapperClass(MyMapper.class);
    job.setCombinerClass(MyReducer.class);
    job.setReducerClsas(MyReducer.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
    FileOutputFormat.setOutputPath(job,new Path(otherArgs[1]));
    System.exit(job.waitForCompletion(true)? 0: 1);
  }
}
