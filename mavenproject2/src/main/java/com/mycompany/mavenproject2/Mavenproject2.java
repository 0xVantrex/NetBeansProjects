/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import javax.swing.JOptionPane;
/**
 *
 * @author vantrex
 */
public class Mavenproject2 {

    public static void main(String[] args) {
         int x,y,sum;      
 x= Integer.parseInt(JOptionPane.showInputDialog("Enter value1"));
 y= Integer.parseInt(JOptionPane.showInputDialog("Enter value2"));
 sum=x+y;
 JOptionPane.showMessageDialog(null, 
         x+" plus "+ y +"="+sum,
         "SUM=", 
         JOptionPane.INFORMATION_MESSAGE);
    }
}
 
