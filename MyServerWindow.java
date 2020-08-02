package orcunsagirsoy;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.control.Label;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyServerWindow extends MyWindow {

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("SERVER");
        label.setFont(new Font(22d));

        BorderPane root = new BorderPane();
        root.setTop(label);
        root.setCenter(txtInfo);

        BorderPane.setAlignment(label, Pos.CENTER);
        BorderPane.setMargin(label, new Insets(10d, 0d, 10d, 0d));

        Scene scene = new Scene(root, 750d, 500d);

        primaryStage.setMinWidth(100d);
        primaryStage.setMinHeight(200d);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SERVER");
        primaryStage.show();
    }
}

