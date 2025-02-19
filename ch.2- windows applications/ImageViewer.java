//ex 4.8; javafx image viewer example

package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Main extends Application{
  @Override
  public void start(Stage stage) throws FileNotFoundException {
    stage.setTitle("image viewer");

    Image image = new Image(new FileInputStream("xxxx"));
    ImageView imageView = new ImageView(image);

    Group root = new Group(imageView);

    Scene scene = new Scene(root, 900, 600);
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}
