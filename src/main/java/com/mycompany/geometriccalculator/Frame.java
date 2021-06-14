
package com.mycompany.geometriccalculator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Arshed
 */
public class Frame extends JFrame{
    
    JTextField t1;
    JTextField t2;
    JTextField t3;
    
    JLabel err;
    
    Frame(){
        setTitle ("Geometry Calculator");
        setLocation(300,200);
        setSize(340,200);

        Container con = getContentPane();
        FlowLayout lay1 = new FlowLayout();
        con.setLayout(lay1);

        JLabel l1 = new JLabel(" Width       :");
        JLabel l2 = new JLabel(" Height      :");
        JLabel l3 = new JLabel(" Answer");
        err = new JLabel();

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(25);
        t3.setSize(200, 40);

        JButton btn1 = new JButton("  Perimeter  ");
        JButton btn2 = new JButton("     Area    ");
        JButton btn3 = new JButton("     Clear    ");
        
//        get perimetre
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {getPerimetre(e);}
        });
        
//        get area
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {getArea(e);}
        });
        
//        clear the textfields
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {clear(e);}
        });
        
        con.add(l1);
        con.add(t1);
        con.add(l2);
        con.add(t2);
        con.add(btn1);
        con.add(btn2);
        con.add(btn3);
        con.add(l3);
        con.add(t3);
        con.add(err);
        
    }

    public void getPerimetre(ActionEvent e){
        try {
            double height = Double.parseDouble(t1.getText());
            double width = Double.parseDouble(t2.getText());
            double perimetre = (height+width)*2;
            t3.setText(String.valueOf(perimetre));
            err.setText("");
        } catch (NumberFormatException r) {
            err.setText("Input should be Numbers");
        }
    }
    
    public void getArea(ActionEvent e){
        try {
            double height = Double.parseDouble(t1.getText());
            double width = Double.parseDouble(t2.getText());
            double area = height*width;
            t3.setText(String.valueOf(area));
            err.setText("");
        } catch (NumberFormatException r) {
            err.setText("Input should be Numbers");
        }
    }

    public void clear(ActionEvent e){
        t1.setText("");
        t2.setText("");
        t3.setText("");
        err.setText("");
    }
    
}
