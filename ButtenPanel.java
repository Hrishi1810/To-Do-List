package com.yash;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtenPanel extends JPanel{
    private JButton addtask;
    private  JButton clear;
    Border emptyBorder = BorderFactory.createEmptyBorder(); // creates an empty border


    ButtenPanel(){
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.GREEN);

        // This section is about the add task button used to add the tasks to the todo list
        addtask = new JButton("ADD TASK");
        addtask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        addtask.setBorder(emptyBorder); // the border of the button is set to the empty border means no border
        this.add(addtask);

        // we need to add a small distance between the two buttons
        this.add(Box.createHorizontalStrut(20));
//
//        // This section is about the clear button used in the todo list to clear the tasks that are completed
        clear = new JButton("REMOVE TASK");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN,20));
        this.add(clear);


    }

    public JButton AddTask(){
        return addtask;
    }

    public JButton getClear(){
        return clear;
    }
}
