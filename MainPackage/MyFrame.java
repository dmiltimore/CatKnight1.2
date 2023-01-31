package MainPackage;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements KeyListener {
    public MyFrame() {
        this.setTitle("JFrame Title Goes Here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized
        this.setLayout(null); 
        this.setVisible(true); //make frame visible
        this.setSize(420, 420); //sets x and y of frame
        this.setLayout(null); 

        ImageIcon image = new ImageIcon("Icon.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(Color.BLACK); //sets background to black
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}