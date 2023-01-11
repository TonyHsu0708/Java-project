package com.company.Sprite.TenCommandmentsSprite;

import com.company.Sprite.Sprite;

import javax.swing.*;

public class TenCommandment extends Sprite {
    public TenCommandment(int x,int y){
        setPosition(x,y);
        img=new ImageIcon("src/com/company/stone.png");
    }

    @Override
    public String overlap(int x, int y) {
        return null;
    }
}
