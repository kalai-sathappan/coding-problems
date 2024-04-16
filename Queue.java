/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue; 
import java.util.*;

/**
 *
 * @author user
 */ 
class queue{ 
    int queueArr[]; 
    int top=-1;  
    queue(int size){ 
        queueArr=new int[size];
    } 
    void enqueue(int value){  
        if(top>queueArr.length){ 
            System.out.println("overflow");
        }
        queueArr[++top]=value;
    } 
    int dequeue(){ 
        if(top==-1){ 
            System.out.print("queue is empty size = "); 
            return 0;
        }     
        int a=queueArr[0];
        for(int i=1;i<=top;i++){ 
            queueArr[i-1]=queueArr[i];
        } 
        --top;
        return a;
    } 
    int length(){ 
        if(top==-1) 
            return 0; 
        return top+1;
    } 
    void display(){ 
        if(top==-1) 
            System.out.println("queue is empty"); 
        for(int i=0;i<=top;i++){ 
            System.out.print(queueArr[i]+"--");
        } 
        System.out.println();
    } 
    int peek(){ 
        if(top==-1){ 
            System.out.print("Empty size = "); 
            return 0;
        } 
        return queueArr[0];
    }
}
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        queue obj=new queue(4); 
        obj.enqueue(2); 
        obj.enqueue(4);
        obj.enqueue(6);
        obj.enqueue(8); 
         System.out.println(obj.dequeue());
          System.out.println(obj.dequeue());
           obj.display();
            System.out.println("Length:"+obj.length()); 
            System.out.println(obj.peek());
           
    }
    
}
