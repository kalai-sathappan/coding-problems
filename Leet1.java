/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leet1;

/**
 *
 * @author user
 */
public class Leet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int a[]={1,2}; 
        int k=4;  
       int temp;
         
        int j=a.length-1 ;  
        for(int m=0;m<k;m++){
        temp=a[j];
        while(j>0){ 
            a[j]=a[j-1]; 
            j--;
        } 
        a[0]=temp;  
        }

        for(int i=0;i<a.length;i++) 
            System.out.println(a[i]); 
    } 
}