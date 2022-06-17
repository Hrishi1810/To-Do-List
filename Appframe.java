package com.yash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Appframe extends JFrame {
    private ButtenPanel btnPanel;
    private TitleBar title;
    private List list;
    private JButton addtask;
    private JButton clear;

    Appframe(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        btnPanel = new ButtenPanel();
        list = new List();

        // This section is basically about the title of the todo list
        this.add(title,BorderLayout.NORTH);
        // BorderLayout.NORTH is used so that the title will appear at the top
        // .SOUTH will set the title at the bottom

        // This section is basically about the buttons that we need to add the tasks and delete the tasks
        this.add(btnPanel, BorderLayout.SOUTH);
        // BorderLayout.SOUTH is used so that the buttons will appear at the bottom of the page

        // This is all about the task adding and the title of the tasks
        this.add(list,BorderLayout.CENTER);
        
        addtask = btnPanel.AddTask();
        clear = btnPanel.getClear();
        
        addListner();
    }

    private void addListner() {
        addtask.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();

                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });

                revalidate();
            }
        });
    }

}
