/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;
public class turunan extends Induk {
public void test(String s){
    System.out.println("Method di dalam kelas turunan");
    System.out.println("S: \""+s+"\"");
}    
public void test(){
    System.out.println("Method override di dalam kelas turunan");
}
}
