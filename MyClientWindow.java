package orcunsagirsoy;


import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class MyClientWindow extends MyWindow implements EventHandler<ActionEvent> {




    private TextField txtWord;

    public static void main(String[] args) {launch(args);}


    @Override
    public void start(Stage primaryStage) throws Exception {

        txtWord = new TextField();
        txtWord.setFont(new Font(16d));

        Button btnSend = new Button("Send");
        btnSend.setOnAction(this);

        Label label = new Label("CLIENT");
        label.setFont(new Font(22d));

        BorderPane grid = new BorderPane();
        grid.setTop(label);
        grid.setCenter(txtWord);
        grid.setRight(btnSend);


        BorderPane root = new BorderPane();
        root.setCenter(txtInfo);
        root.setTop(grid);

        BorderPane.setAlignment(label, Pos.CENTER);
        BorderPane.setAlignment(btnSend, Pos.CENTER);
        BorderPane.setMargin(label, new Insets(10d, 0d, 10d, 0d));
        BorderPane.setMargin(txtWord, new Insets(10d));
        BorderPane.setMargin(btnSend, new Insets(10d));


        primaryStage.setScene(new Scene(root,750d, 500d));
        primaryStage.setResizable(false);
        primaryStage.setTitle("CLIENT");
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {

    }
}
