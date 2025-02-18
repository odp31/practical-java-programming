// ex 11.3; java hadoop total marks program
import java.util.*;
import java.io.IOException;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;
import org.apache.hadoop.util.*;

//mapper class
class MyMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
  public void map(LongWritable key,Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
    String line = value.toString();
    String lasttoken = null;
    StringTokenizer s = new StringTokenizer(line,"\t");
    String name = s.nextToken();

    while(s.hasMoreTokens()){
      lasttoken =  s.nextToken();
    }
    int mark = Integer.parseInt(lasttoken);
    output.collect(new Text(name),new IntWritable(mark));
  }
}
class MyReduce extends MapReduceBase implements Reducer<Text,IntWritable,Text,IntWritable>{
  public void reduce(Text key,Iterator<IntWritable> values, OutputCollector<Text, IntWritable>output, Reporter reporter) throws IOException {
    int sum = 0;
    while(values.hasNext()) {
      sum += values.next().get();
    }
    output.collect(key,new IntWritable(sum));
  }
}
public static void main(String args[]) throws Exception{
  JobConf conf = new JobConf(MyMarker.class);
  conf.setJobName("max_elecricityunits");
  conf.setOutputKeyClass(Text.class);
  conf.setOutputValueClass(IntWritable.class);
  conf.setMapperClass(MyMapper.class);
  conf.setCombinerClass(MyReduce.class);
  conf.setReducerClass(MyReduce.class);
  conf.setInputFormat(TextInputFormat.class);
  conf.setOutputFormat(TextOutputFormat.class);
  FileInputFormat.setInputPaths(conf,new Path(args[0]));
  FileOutputFormat.setOutputPath(conf, new Path(args[1]));
  JobClient.runJob(conf);
}
}
