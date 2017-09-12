/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat3;
public class Gajah extends Hewan {
    public static void testClassMehod(){
    System.out.println("The Class method in  Hewan...");
    }
    public void testInstanceMethod()
    {
        System.out.println("The instance method in Hewan..."); 
    }
    
    public static void main (String[] args){
    Gajah myGajah = new Gajah();
    Hewan myHewan = myGajah;
    Hewan.testClassMethod();
    myHewan.testInstanceMethod();
    }
    }

