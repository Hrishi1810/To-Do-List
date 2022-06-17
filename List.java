package com.yash;

import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    List(){
        GridLayout layout = new GridLayout(10,1); // gives the grid that is required to add and remove tasks
        layout.setVgap(5);// This is creates the vertical gap between two tasks

        this.setLayout(layout);
        this.setBackground(Color.LIGHT_GRAY);
    }
    public void updateNumbers(){
        Component[] listItems = this.getComponents();

        for (int i = 0; i < listItems.length; i++) {
            if(listItems[i] instanceof Task){
                ((Task)listItems[i]).changeindex(i+1);
            }
        }
    }


}
