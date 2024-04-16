/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author user
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */  
    Node head;
    static class Node{ 
        int data; 
        Node next; 
        Node(int val){ 
            data=val; 
            next=null;
        }
    } 
    public static void inEnd(LinkedList list,int data){ 
        Node new_node=new Node(data); 
        new_node.next=null;  
        
        if(list.head==null){ 
            list.head=new_node; 
            
        } 
        else{ 
                Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            // Insert the new_node at last node 
            last.next = new_node;  
        }
    }  
    public static void inBegin(LinkedList list,int data){ 
        Node new_node=new Node(data); 
        new_node.next=null;
        if(list.head==null){ 
            list.head=new_node; 
        } 
        else{ 
            new_node.next=list.head; 
            list.head=new_node;
        }
    } 
   public static void inPosition(LinkedList list, int pos, int data) {
    Node new_node = new Node(data);
    new_node.next = null;
    
    if (list.head == null) {
        System.out.println("It points to head not position as list is empty");
        list.head = new_node;
        return;
    }

    if (pos <= 0) {
        // Insert at the beginning if pos <= 0
        new_node.next = list.head;
        list.head = new_node;
        return;
    }

    Node temp = list.head;
    int c = 1;
    while (temp.next != null) {
        if (c < pos) {
            c++;
            temp = temp.next;
        } else {
            new_node.next = temp.next;
            temp.next = new_node;
            return;
        }
    }

    // If pos is beyond the end of the list, insert at the end
    temp.next = new_node;
}

         
    public static void display(LinkedList list){ 
        Node temp; 
        temp=list.head; 
        while(temp!=null){ 
            System.out.print(temp.data+"->"); 
            temp=temp.next; 
        } 
        System.out.println();
    } 
    public static void delBegin(LinkedList list){ 
      
    if (list.head == null) {
        return; // Nothing to delete
    }
    
    list.head = list.head.next;
}

     
    public static void delEnd(LinkedList list) {
    if (list.head == null) {
        return; // Nothing to delete
    }
    
    Node temp = list.head;
    Node prev = null;
    
    while (temp.next != null) {
        prev = temp;
        temp = temp.next;
    }
    
    if (prev == null) {
        list.head = null; // If there is only one node in the list
    } else {
        prev.next = null; // Set the next of the second-last node to null
    }
}

    public static void delPos(LinkedList list, int position) {
    if (list.head == null) {
        return; // Nothing to delete
    }
    
    Node temp = list.head;
    if (position == 1) {
        list.head = temp.next;
        return;
    }

    for (int i = 1; temp != null && i < position - 1; i++) {
        temp = temp.next;
    }
    if (temp == null || temp.next == null) {
        return; // If position is greater than number of nodes
    }

    Node next = temp.next.next;
    temp.next = next;
}

    public static void main(String[] args) {
        // TODO code application logic here 
        LinkedList list=new LinkedList(); 
        inEnd(list,4); 
        inEnd(list,5); 
        inEnd(list,6); 
        
        
        display(list); 
        
        
 
}
}