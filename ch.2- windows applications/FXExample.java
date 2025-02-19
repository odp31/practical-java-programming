// ex 4.4; javaFX example
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Main extends Application {
  @Override
  public void start(Stage primaryStorage) throws Exception {
    primaryStage.setTitle("hello world");
    FlowPane root = new FlowPane();
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}
