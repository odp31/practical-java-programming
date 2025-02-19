// ex 4.5; javafx program with label and button
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
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("hello world");
    Lable label  = new Label("my label");
    Button btn = new Button();
    btn.setText("say hello world");
    btn.setOnAction(new EventHandler<ActionEvent>()
                    @Override
      public static void handle (ActionEvent event) {
        label.setText("hello world");
  }
});
Flowpane root = new FlowPane();
root.getChildren().add(label);
root.getChildren().add(btn);
primaryStage.setScene(new Scene(root, 300, 250));
primaryStage.show();
}
public static void main(String[] args) {
  launch(args);
}
}
        
      
