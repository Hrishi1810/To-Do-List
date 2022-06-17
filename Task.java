package com.yash;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel{
    private JLabel index; // this is used to denote the index of the task
    private JTextField taskName;
    private JButton done;
    private boolean checked;

    Task(){
        this.setPreferredSize(new Dimension(40,20));
//        this.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());

        checked = false;

        // this is all about the index number of the task
        index = new JLabel(""); // the index will be filled automatically
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        // this all about the task and the title of the task
        taskName = new JTextField("Your task here"); // For now the message in the argument will be displayed
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.WHITE);
        this.add(taskName,BorderLayout.CENTER);

        // this all about the button to check if the task is done or not
        done = new JButton("Done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone(){
        return done;
    }

    public void changeindex(int num){
        this.index.setText(num+"");
        this.revalidate();

    }

    public void changeState(){
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
    }
}
