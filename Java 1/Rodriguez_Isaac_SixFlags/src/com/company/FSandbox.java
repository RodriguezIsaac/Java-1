package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class FSandbox extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        AffineTransform Default = g2.getTransform();

        //todo Flag Uno
        g2.setColor(Color.green);
        g2.fillRect(0, 0, 400, 100);
        g2.setColor(Color.blue);
        g2.fillRect(0, 200, 400, 100);
        g2.setColor(Color.white);
        g2.fillRect(0, 100, 400, 100);

        //todo Flag Dos
        g2.fillRect(400, 0, 400, 300);
        g2.setColor(Color.blue);
        g2.fillRect(400, 115, 400, 75);
        g2.fillRect(500, 0, 80, 300);
        g2.setColor(Color.red);
        g2.fillRect(400, 135, 400, 35);
        g2.fillRect(523, 0, 35, 300);

        //todo Flag Tres
        g2.setColor(Color.blue);
        g2.fillRect(800, 0, 133, 300);
        g2.setColor(Color.red);
        g2.fillRect(933, 150, 267, 150);
        g2.setColor(Color.white);
        g2.fillRect(933, 0, 267, 150);

        //Star
        int [] x = {812, 850, 866, 882, 920, 890, 903, 866, 830, 842};
        int [] y = {125, 125, 80, 125, 125, 155, 193, 169, 193, 155};
        g2.fillPolygon(x, y, 10);

        //todo Flag Cuatro
        g2.setColor(Color.red);
        g2.fillRect(0, 300, 400, 300);

        //Crescent Moon
        g2.setColor(Color.white);
        g2.fillOval(30, 360, 175, 175);
        g2.setColor(Color.red);
        g2.fillOval(60, 376, 155, 145);

        //Star
        g2.setColor(Color.white);
        int [] x1 = {60, 93, 109, 125, 163, 133, 146, 109, 73, 85};
        int [] y1 = {475, 475, 430, 475, 475, 505, 543, 519, 543, 505};
        g2.rotate(Math.toRadians(-15));
        g2.fillPolygon(x1, y1, 10);

        //Resets the transformation/rotation
        g2.setTransform(Default);

        //todo Flag Cinco
        g2.setColor(Color.red);
        g2.fillRect(400, 300, 75, 300);
        g2.fillRect(725, 300, 75, 300);
        g2.setColor(Color.white);
        g2.drawLine(400, 300, 400, 600); //Used to separate Flag Cuatro from Flag Cinco
        g2.fillRect(475, 300, 250, 300);

        //Maple Leaf
        AffineTransform Scaling = new AffineTransform();
        Scaling.scale(0.45, 0.45);
        g2.setTransform(Scaling);

        g2.setColor(Color.red);
        int [] x2 = {600, 650, 700, 675, 770, 775, 825, 800, 850, 725, 775, 625, 650, 575, 600, 425, 475, 350, 400, 375, 425, 430, 525, 500, 550};
        int [] y2 = {325, 400, 350, 500, 425, 475, 450, 525, 525, 650, 700, 675, 800, 800, 675, 700, 650, 525, 525, 450, 475, 425, 500, 350, 400};

        g2.translate(735, 425);
        g2.fillPolygon(x2, y2, 25);

        g2.setTransform(Default);

        //todo Flag Seis
        g2.fillRect(975, 300, 225, 23);
        g2.fillRect(975, 346, 225, 23);
        g2.fillRect(975, 392, 225, 23);
        g2.fillRect(975, 438, 225, 23);
        g2.fillRect(800, 484, 400, 23);
        g2.fillRect(800, 530, 400, 23);
        g2.fillRect(800, 576, 400, 23);
        g2.setColor(Color.blue);
        g2.fillRect(800, 300, 175, 161);
        g2.setColor(Color.white);
        g2.fillRect(975, 323, 225, 23);
        g2.fillRect(975, 369, 225, 23);
        g2.fillRect(975, 415, 225, 23);
        g2.fillRect(800, 461, 400, 23);
        g2.fillRect(800, 507, 400, 23);
        g2.fillRect(800, 553, 400, 23);
        g2.drawLine(800, 300, 1200, 300);
        g2.drawLine(800, 300, 800, 600);

        //Stars
        AffineTransform Scaling1 = new AffineTransform();
        Scaling1.scale(0.55, 0.55);
        g2.setTransform(Scaling1);

        //Points for Star
        int [] x3 = {803, 812, 816, 820, 830, 822, 826, 816, 807, 810};
        int [] y3 = {316, 316, 305, 316, 316, 324, 333, 327, 333, 324};

        g2.translate(603, 250);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                g2.translate(55, 0);
                g2.fillPolygon(x3, y3, 10);
            }
            g2.translate(-330, 60);
        }

        g2.translate(0, -270);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                g2.translate(82, 0);
                g2.fillPolygon(x3, y3, 10);
                g2.translate(-27, 0);
            }
            g2.translate(-275, 60);
        }
    }
}