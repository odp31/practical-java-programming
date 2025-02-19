// ex 4.11; creating a menu using the filechooser class 

package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws FileNotFoundException {
    primaryStage.setTitle("javafx file chooser");
    ImageView imageView = new ImageView();
    FileChooser fileChooser = new FileChooser();
    Button button = new Button("select image file");
    button.setOnAction (e-> {
      File file = fileChooser.showOpenDialog(primaryStage);
      if(file!=null){
        System.out.println("selected file:" + file);
        try {
          Image image = new Image(new FileInputStream(file));
          imageView.setImage(image);
        }
        catch (FileNotFoundException ex) {
        }
      }
    });
    BorderPane bp = new BorderPane();
    bp.setTop(button);
    bp.setCenter(imageView);
    Scene scene = new Scene(bp, 700, 500);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
