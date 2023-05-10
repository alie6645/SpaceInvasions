package com.example.spaceinvader1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;

public class FrameHandler implements EventHandler {
    KeyCode key;
    Player player;
    private final double SPEED = 5;
    @Override
    public void handle(Event event) {
        switch (key){
            case SPACE -> player.shoot();
            case RIGHT -> player.setxChange(SPEED);
            case LEFT -> player.setxChange(-SPEED);
        }
        player.update();
    }

    public void checkCollisions(){

    }

    public void setKey(KeyCode key){
        this.key = key;
    }
}
