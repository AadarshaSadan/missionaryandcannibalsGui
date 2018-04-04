package game.display;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Display {
 private JFrame frame;
 private Canvas canvas;//this allow us to draw in jframe
 private String title;
 private int width, height;
 
 private JButton button;
 
 public Display(String title,int width,int height) //making constructer for displaying windows
 {
	 this.title=title;
	 this.width=width;
	 this.height=height;
	 
	 createDisplay();
 }
 
 
 private void createDisplay()
 {
	 frame=new JFrame(title);
	 frame.setSize(width, height);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//if this code is not enable then no close jframe
     frame.setResizable(false);//we don't need to resize
     frame.setLocationRelativeTo(null);//default at center
     frame.setVisible(true);
     //frame.setBackground(Color.RED);
     
     canvas=new Canvas();
     canvas.setPreferredSize(new Dimension(width,height));
     canvas.setMaximumSize(new Dimension(width,height));
     canvas.setMinimumSize(new Dimension(width,height));
     frame.add(canvas);
     frame.pack();
 }
 
 
 public Canvas getCanvas() {//pass canvas to access other class
	 return canvas;
	 
 }
 

}
