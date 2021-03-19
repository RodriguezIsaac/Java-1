package com.company;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GraphicsSandbox extends JComponent {

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        Line2D.Double line1 = new Line2D.Double(500, 150, 700, 150);
        Line2D.Double line2 = new Line2D.Double(700, 150, 850, 300);
        Line2D.Double line3 = new Line2D.Double(850, 300, 850, 500);
        Line2D.Double line4 = new Line2D.Double(850, 500, 700, 650);
        Line2D.Double line5 = new Line2D.Double(700, 650, 500, 650);
        Line2D.Double line6 = new Line2D.Double(500, 650, 350, 500);
        Line2D.Double line7 = new Line2D.Double(350, 500, 350, 300);
        Line2D.Double line8 = new Line2D.Double(350, 300, 500, 150);


        Color a_color = new Color(255, 0, 0, 255);
        Color b_color = new Color(0, 0, 0);
        g2.setPaint(a_color);


        //g2.drawRect(250, 150, 750, 350);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);
        g2.draw(line5);
        g2.draw(line6);
        g2.draw(line7);
        g2.draw(line8);

        setFont(getFont().deriveFont(120f));
        g2.setPaint(b_color);
        g2.drawString("STOP", 440, 435);

        //g2.drawString("I am dangerous", 325, 325);

        //Drawing Polygons
        Polygon horse_shoe = new Polygon();
            horse_shoe.addPoint(50, 100);
            horse_shoe.addPoint(200, 100);
            horse_shoe.addPoint(200, 400);
            horse_shoe.addPoint(150, 400);
            horse_shoe.addPoint(150, 250);
            horse_shoe.addPoint(100, 250);
            horse_shoe.addPoint(100, 400);
            horse_shoe.addPoint(50, 400);
        g2.draw(horse_shoe);
    }
}