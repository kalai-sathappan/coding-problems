/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
class Question{
int i;
}
class Test extends Question{
int j;
void display(){
i = j + 1;
System.out.println(j + " " + i); 
}}
/**
 *
 * @author user
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
Test obj = new Test();
obj.i=1;
obj.j=2;
obj.display();
}}

    
