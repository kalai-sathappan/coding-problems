/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedparentesis; 

import java.util.*;

/**
 *
 * @author user
 */
public class Balancedparentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
       String exp =  "[]{[]}[[]]";
/*
  valid - 1. Every opening should have a closing after it. 
              2. Every bracket should have a correct pairing.
          
*/

     System.out.println("balaced;"+isValidParentheses(exp));



  }
    public static boolean isValidParentheses(String str){
    
      Stack<Character> stack = new Stack<>();

      for(int i=0;i<str.length();i++){
          char ch = str.charAt(i); 

          if(ch =='(' || ch=='[' || ch=='{'){
              stack.push(ch);
          }else{

             if(stack.isEmpty()){
                return false;
             }else if( matchingPair(stack.pop() , ch) == false){
                return false;
             }

          }

      }

      return stack.isEmpty();

    }


    public static boolean matchingPair(char opening, char closing){
       return (
        
        (opening == '(' && closing==')') ||
         (opening == '[' && closing == ']') ||
         (opening == '{' && closing == '}') 
       );
    }




}

