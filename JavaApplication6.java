/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author user
 */
public class JavaApplication6 {
    JavaApplication6(){  
        //this(5);
        System.out.println("hai");
    } 
    JavaApplication6(int a){  
        this();
        System.out.println("hai"+a);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        JavaApplication6 obj=new JavaApplication6(3);
    }
    
}
