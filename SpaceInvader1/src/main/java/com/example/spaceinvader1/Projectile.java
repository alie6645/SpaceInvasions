package com.example.spaceinvader1;

import javafx.scene.shape.Rectangle;

public class Projectile extends MovingObject{
    double length = 20;
    public Projectile(double xChange, double yChange){
        setxChange(xChange);
        setyChange(yChange);
    }

    @Override
    public void initializeSprite() {
        Rectangle rectangle = new Rectangle(2,length);
    }
}
