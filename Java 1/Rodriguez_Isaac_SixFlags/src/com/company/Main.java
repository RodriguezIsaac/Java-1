package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        FSandbox graphics = new FSandbox();

        window.setVisible(true);
        window.setTitle("Isaac Rodriguez");
        window.setSize(1200, 638);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(graphics);
    }
}