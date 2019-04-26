package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Note that the {@link Application} class must not contain the main method
 * itself. See: https://openjfx.io/openjfx-docs/#NB-Maven
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("NetBeans JavaFX Example");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(new Label("Hello World!"));
        Scene scene = new Scene(borderPane, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
