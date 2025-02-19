// ex 4.9; imageviewer2 using javafx 

package sample;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.scene.Group;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  public void start(Stage stage) {
    stage.setTitle("web viewer");
    WebView webView = new WebView9);
    webView.getEngine().load("http://google.com");

    Group root = new Group(webView);
    Scene scene = new Scene(root, 800,500);
    stage.setScene(scene);
    stage.show();
  }
}
