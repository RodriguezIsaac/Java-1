package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Creates a new instance of a JFrame (Window)
        JFrame GraphicsWindow = new JFrame();

        //References the 2nd class that was created for the graphics
        GraphicsSandbox graphics = new GraphicsSandbox();

        //Giving properties to my JFrame
        GraphicsWindow.setVisible(true); //Makes the window visible
        GraphicsWindow.setSize(1366, 768); //Sets size of the created window
        GraphicsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When the X is clicked, the program exits
        GraphicsWindow.setTitle("Isaac Rodriguez");

        GraphicsWindow.add(graphics);
    }
}
