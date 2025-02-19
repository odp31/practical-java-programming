// ex 4.7; javafx GUI component Login example

package sample;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage stage) {
    Text text1 = new Text("username");
    Text text2 = new Text("password");
    TextField textField1 = new TextField();
    PasswordField textField2 = new TextField();
    Button button1 = new Button("login");
    GridPane gridPane = new GridPane();
    gridPane.setMinSize(400,200);
    gridPane.setAlignment(Pos.CENTER);
    gridPane.add(text1, 0, 0);
    gridPane.add(textField1, 1, 0);
    gridPane.add(text2, 0, 1);
    gridPane.add(textField2, 1, 1);
    gridPane.add(button1,0,2);
    Scene scene = new Scene(gridPane);
    stage.setTitle("bank login");
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String args[]){
    launch(args);
  }
}
