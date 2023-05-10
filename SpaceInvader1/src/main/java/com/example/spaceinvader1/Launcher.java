package com.example.spaceinvader1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.List;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();

        FrameHandler frameHandler = new FrameHandler();

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(100),frameHandler));
        timeline.setCycleCount(Timeline.INDEFINITE);


        Player player = new Player();
        addSprite(root,player.getSprite());
        Scene scene = new Scene(root,500,500);
        startKeyController(scene, frameHandler);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    public static void startKeyController(Scene scene, FrameHandler frameHandler){
        scene.setOnKeyPressed(evt -> {
            KeyCode code = evt.getCode();
            switch (code) {
                case RIGHT:
                case LEFT:
                    frameHandler.key = code;
                    break;
            }
        });
        scene.setOnKeyReleased(evt -> {
            KeyCode code = evt.getCode();
            if (frameHandler.key == code) {
                frameHandler.key = null;
            }
        });

    }

    public static void addSprite(Group root, List<Node> nodes){
        for (int i=0 ;i<nodes.size(); i++){
            root.getChildren().add(nodes.get(i));
        }
    }
}
