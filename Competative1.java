/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competative1;

/**
 *
 * @author user
 */
public class Competative1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here 
        int n; 
        int ft,lt,sum,sq; 
        
        for( n=1000;n<=9999;++n){ 
            ft=n/100; 
            lt=n%100; 
            sum=ft+lt; 
            sq=sum*sum; 
            if(sq==n){ 
                System.out.println(n);
            }
        }
    }
    
}
