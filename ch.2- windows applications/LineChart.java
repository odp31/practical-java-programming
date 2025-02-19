// ex 4.6; fx line chart example

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;


public class Main extends Application {
  @Override
  public void start(Stage stage) {
    NumberAxis xAxis = new NumberAxis(0,50, 10);
    xAxis.setLabel("time [s]");

    NumberAxis yAxis = new NumberAxis(0, 20, 2);
    yAxis.setLabel("voltage [V]:);

    LineChart linechart = new LineChart(xAxis, yAxis);
    XYChart.Series series = new XYChart.Series();
    series.setName("measurement results");

    series.getData().add(new XYChart.Data(0, 15));
    series.getData().add(new XYChart.Data(10, 3));
    series.getData().add(new XYChart.Data(20, 6));
    series.getData().add(new XYChart.Data(30, 12));
    series.getData().add(new XYChart.Data(40, 2));
    series.getData().add(new XYChart.Data(50, 10));

    linechar.getData().add(series);
    Group root = new Group(linechart);
    Scene scene = new Scene(root, 600, 400);
    stage.setTitle("line chart");
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}



