
package javaapplication25;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class JavaApplication25 {

    
    public static void main(String[] args) {
        
        new JavaApplication25();
         Random rd = new Random();
	     JFrame jf = new JFrame();
	     jf.setLayout(null);
	     
	     jf.setSize(500,500);
	     
	     jf.setTitle("Arrow Game");
	   
	     Icon topIcon = new ImageIcon("Up.jpg");
	     Icon leftIcon = new ImageIcon("left.jpg");
	     Icon downIcon = new ImageIcon("Down.jpg");
	     Icon rightIcon = new ImageIcon("Right.jpg");
	     Icon blank = new ImageIcon("blank.jpg");
	     
	     JButton play = new JButton("Play");
	     JButton reset = new JButton("Reset");
	     JButton top = new JButton("");
	     JButton down = new JButton("");
	     JButton left = new JButton("");
	     JButton right = new JButton("");
	     
	     JLabel score =  new JLabel("score : 0");
	     JLabel arrow =  new JLabel(blank);
	     
	     JPanel panel1 = new JPanel();
	     panel1.setBounds(0,0,500,70);
	     JPanel panel2 = new JPanel();
	     panel2.setBounds(0,70,500,70);
	     JPanel panel3 = new JPanel();
	     panel3.setBounds(0,140,500,70);
	     
	     JPanel panel4 = new JPanel();
	     panel4.setBounds(0,210,500,50);
	     
	     panel1.add(top);
	     panel2.add(left);
	     panel2.add(arrow);
	     panel2.add(right);
	     panel3.add(down);
	     panel4.add(play);
	     panel4.add(score);
	     panel4.add(reset);
	     
             
	     jf.add(panel1);
	     jf.add(panel2);
	     jf.add(panel3);
	     jf.add(panel4);
    
             play.addActionListener(new ActionListener(){
  	 public void actionPerformed(ActionEvent e) {
  		 int i = rd.nextInt(20);
  		 if(i%4==0)
  			 arrow.setIcon(rightIcon);
  		 else if(i%4==1)
  			 arrow.setIcon(leftIcon);
  		 else if(i%4==2)
  			 arrow.setIcon(topIcon);
  		 else
  			 arrow.setIcon(downIcon);	 
  	 }
  	 
   });
   
   top.addActionListener(new ActionListener() {
  	 public void actionPerformed(ActionEvent e) { 
  		 if(arrow.getIcon()==topIcon) 
  			 JOptionPane.showMessageDialog(jf,"click play  button to start ");
  		 else {
  			 if (arrow.getIcon()==topIcon) {
  				 String line =score.getText();
  				 String[] token =line.split(";");
  				 int scoreValue = Integer.parseInt(token[1]);
  				 scoreValue++;
  				 score.setText("Score:"+scoreValue);
  			 }
  			 else {
  				 score.setText("Score: 0");
  			 }
  			 int j = rd.nextInt(20);
  			 if(j%4==0)
  				 arrow.setIcon(rightIcon);
  			 else if(j%4==1)
  				 arrow.setIcon(leftIcon);
  			 else if (j%4==2)
  				 arrow.setIcon(topIcon);
  			 else 
  				 arrow.setIcon(downIcon);
  		 }
  	 }
   });
   
   left.addActionListener(new ActionListener() {
  	 public void actionPerformed(ActionEvent e) { 
  		 if (arrow.getIcon()==leftIcon)
  			 JOptionPane.showMessageDialog(jf,"click play  button to start ");
  		 else {
  			 if (arrow.getIcon()==blank) {
  				 String line = score.getText();
  				 String[]token =line.split(";");
  				 int scoreValue = Integer.parseInt(token[1]);
  				 scoreValue++;
  				 score.setText("score:"+scoreValue);
  			 }
  			 else {
  				 score.setText("Score:0");
  			 }
  			 int k =rd.nextInt(20);
  			 if (k%4==0)
  				 arrow.setIcon(rightIcon);
  			 else if (k%4==1)
  				 arrow.setIcon(leftIcon);
  			 else if (k%4==2)
  				 arrow.setIcon(topIcon);
  			 else 
  				 arrow.setIcon(downIcon);
  			 
  		 }
  	 }
  	 
   });
   right.addActionListener(new ActionListener() {
  	 public void actionPerformed(ActionEvent e) { 
  		 if (arrow.getIcon()==leftIcon)
  			 JOptionPane.showMessageDialog(jf,"click play  button to start ");
  		 else {
  			 if (arrow.getIcon()==blank) {
  				 String line = score.getText();
  				 String[]token =line.split(";");
  				 int scoreValue = Integer.parseInt(token[1]);
  				 scoreValue++;
  				 score.setText("Score: "+scoreValue);
  			 }
  			 else {
  				 score.setText("Score: 0");
  			 }
  			 int l =rd.nextInt(20);
  			 if (l%4==0)
  				 arrow.setIcon(rightIcon);
  			 else if (l%4==1)
  				 arrow.setIcon(leftIcon);
  			 else if (l%4==2)
  				 arrow.setIcon(topIcon);
  			 else 
  				 arrow.setIcon(downIcon);
  			 
  		 }
  	 }
  	 
   });
   down.addActionListener(new ActionListener() {
  	 public void actionPerformed(ActionEvent e) { 
  		 if (arrow.getIcon()==leftIcon)
  			 JOptionPane.showMessageDialog(jf,"click play  button to start the game first.");
  		 else {
  			 if (arrow.getIcon()==blank) {
  				 String line = score.getText();
  				 String[]token =line.split(";");
  				 int scoreValue = Integer.parseInt(token[1]);
  				 scoreValue++;
  				 score.setText("Score: "+scoreValue);
  			 }
  			 else {
  				 score.setText("Score: 0");
  			 }
  			 int m =rd.nextInt(20);
  			 if (m%4==0)
  				 arrow.setIcon(rightIcon);
  			 else if (m%4==1)
  				 arrow.setIcon(leftIcon);
  			 else if (m%4==2)
  				 arrow.setIcon(topIcon);
  			 else 
  				 arrow.setIcon(downIcon);
  			 
  		 }
  	 }
  	 
   });
   
   reset.addActionListener(new ActionListener() {
  	 public void actionPerformed(ActionEvent e) { 
  		 score.setText("Score: 0");
  		 arrow.setIcon(blank);
  	 }
   });
             
             
             
        jf.setVisible(true);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
    
    

       
   
    

