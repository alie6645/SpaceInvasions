package com.example.spaceinvader1;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.transform.Translate;

import java.util.ArrayList;
import java.util.List;

public abstract class MovingObject {
    double xChange;
    double yChange;
    List<Node> sprite = new ArrayList<>();
    Translate translate = new Translate();

    public MovingObject(){
        initializeSprite();
    }

    public abstract void initializeSprite();

    public void setxChange(double xChange){
        this.xChange = xChange;
    }

    public List<Node> getSprite(){
        return sprite;
    }

    public void setyChange(double yChange){
        this.yChange = yChange;
    }

    public void update(){
        for (Node node:sprite){
            node.getTransforms().clear();
            translate.setX(xChange);
            translate.setY(yChange);
            node.getTransforms().add(translate);
        }
    }

    public boolean checkCollision(Point2D point2D){
        for (Node node:sprite){
            if (node.contains(point2D)){
                return true;
            }
        }
        return false;
    }
}
