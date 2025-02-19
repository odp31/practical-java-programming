// ex 4.10; javafx menu example

package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.Group;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX Menu");
    MenuBar menuBar = new MenuBar();
    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());

    Menu fileMenu = new Menu("File");
    MenuItem newMenuItem = new MenuItem("open");
    MenuItem exitMenuItem = new MenuItem("exit");
    exitMenuItem.setOnAction(actionEvent -> Platform.exit());
    fileMenu.getItems().addAll(newMenuItem, new SeparatorMenuItem(), exitMenuItem);
    menuBar.getMenus().add(fileMenu);

    BorderPane bp = new BorderPane();
    bp.setTop(menuBar);
    Scene scene = new Scene(bp,400,300);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
