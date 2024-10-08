package echo.javafx;

import java.io.IOException;

import echo.main.Echo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Echo echo = new Echo();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Echo");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setEcho(echo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




