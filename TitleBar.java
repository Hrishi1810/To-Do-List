package com.yash;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    JLabel titletext; // The text we want to give to the title is set by this
    TitleBar(){
        this.setPreferredSize(new Dimension(400,50));
//        this.setBackground(Color.RED);
        titletext = new JLabel("TO DO LIST"); // Its constructor takes an argument that is the title text we want it to have
        titletext.setPreferredSize(new Dimension(400,50)); // Set the size of the text
        titletext.setFont(new Font("Sans-serif", Font.BOLD,30)); // used to set the fonts of the titleText
//        titletext.setText("Hello Bitch"); // .setTExt method is used to set the text of the title bar
        titletext.setHorizontalAlignment(JLabel.CENTER); // This is used to set the alignment of the text
        // Argument JLable.CENTER means the text will be aligned to the center

        this.add(titletext); // this.add() classic method
    }


}
