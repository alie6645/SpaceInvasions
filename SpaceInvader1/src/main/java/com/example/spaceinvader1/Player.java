package com.example.spaceinvader1;

import javafx.scene.shape.Polygon;

public class Player extends Target {
    final double scale = 20;
    @Override
    public void initializeSprite() {
        Polygon poly = new Polygon(scale /2,0, scale, scale,0, scale);
        getSprite().add(poly);
    }

    @Override
    public void onHit() {

    }

    public void shoot() {

    }
}
