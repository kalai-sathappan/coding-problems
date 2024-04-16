/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author user
 */
public class JavaApplication20 extends Thread{
public void run(){
for(int i=1;i<5;i++){
System.out.println(++i);
}
}    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        JavaApplication20 o=new JavaApplication20 (); 
        o.run();
    } 
}
    

