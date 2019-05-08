// Java program to demonstrate 
//schedule method calls of Timer class 
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;  


import java.util.Timer; 
import java.util.TimerTask; 


/**
 * Write a description of class Helper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Helper extends TimerTask 
{ 
    public static int timeRemain = 0;
    public static boolean booleeen = false;
    
    public void run() 
    {   
        if(!booleeen) {
            timeRemain += 1; 
            SpeedyBoiGUI.timerMsg.setText("Time: " + Helper.timeRemain);
            SpeedyBoiGUI.timerMsg.setVisible(true);
        } else {
            timeRemain = 0;
            SpeedyBoiGUI.timerMsg.setText("Time: " + Helper.timeRemain);
            SpeedyBoiGUI.timerMsg.setVisible(true);
        }
    } 
} 
