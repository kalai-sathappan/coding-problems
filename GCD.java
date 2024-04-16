/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd; 
import java.io.*; 
import java.util.*; 
import java.util.Scanner;
class kalai{  
    //int a,b;
    
    int gcd(int a,int b) 
    { 
        
        if(a==0)
            return b;
         
        else
            return gcd(b%a,a);
    }
    
}
/**
 *
 * @author user
 */
public class GCD { 
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();  
        int d=s.nextInt();
        
        kalai o=new kalai();
        int a=o.gcd(c,d);
        System.out.println(a);
        
    }
    
}
