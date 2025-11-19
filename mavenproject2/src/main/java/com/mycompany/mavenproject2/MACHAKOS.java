/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author vantrex
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class MACHAKOS {
    public static void main(String[] args)
    {
        String[]options = {"2.1", "2.2", "3.1", "3.2"};
        ImageIcon icon = new ImageIcon("machakos.png");
     String course=(String)JOptionPane.showInputDialog(null,
      "What is your cohort","Machakos University",
      JOptionPane.QUESTION_MESSAGE,icon, options ,options[2]);
     JOptionPane.showMessageDialog(null, course,"My"
             + " Course" ,JOptionPane.INFORMATION_MESSAGE);
    }
  
}
