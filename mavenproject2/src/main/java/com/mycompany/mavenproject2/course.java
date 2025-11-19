/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author vantrex
 */
import javax.swing.JOptionPane;
public class course 
{
    public static void main(String[] args) 
    {
String course= JOptionPane.showInputDialog("Enter your course");
 JOptionPane.showMessageDialog(null, 
         course,
         "MY COURSE", 
         JOptionPane.INFORMATION_MESSAGE);
    }
}
