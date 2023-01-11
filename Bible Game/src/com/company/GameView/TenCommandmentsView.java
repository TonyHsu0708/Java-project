package com.company.GameView;

import com.company.Sprite.TenCommandmentsSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;



public class TenCommandmentsView extends GameView{

    public ArrayList<TenCommandment> getTenCommandments() {
        return tenCommandments;
    }

    private ArrayList<TenCommandment> tenCommandments=new ArrayList<TenCommandment>();
    public TenCommandmentsView(){
        img=new ImageIcon("src/com/company/mountain.jpg");
        elements=new ArrayList<>();

        tenCommandments.add(new TenCommandment(5,3));
        tenCommandments.add(new TenCommandment(4,4));
        tenCommandments.add(new TenCommandment(6,4));
        tenCommandments.add(new TenCommandment(3,5));
        tenCommandments.add(new TenCommandment(7,5));
        tenCommandments.add(new TenCommandment(3,6));
        tenCommandments.add(new TenCommandment(7,6));
        tenCommandments.add(new TenCommandment(4,7));
        tenCommandments.add(new TenCommandment(6,7));
        tenCommandments.add(new TenCommandment(5,8));

        elements.addAll(tenCommandments);

    }


}
