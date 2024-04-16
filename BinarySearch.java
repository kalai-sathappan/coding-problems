/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author user
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */ 
   public static int binary(int arr[], int target, int high, int low) {
    if (low <= high) {
        int mid = (high + low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binary(arr, target, mid - 1, low); // Return the result of the recursive call
        } else { 
            return binary(arr, target, high, mid + 1); // Return the result of the recursive call
        }
    }
    return -1;
}

    public static void main(String[] args) {
        // TODO code applilcation logic here  
        int arr[]={2,4,6,8,10}; 
        int target=4;
        BinarySearch obj=new BinarySearch(); 
        int a=obj.binary(arr,target,arr.length-1,0); 
        if(a==-1){ 
            System.out.println(target+" not present "); 
        } 
        else{ 
            System.out.println(target+" present at "+a);
        }
        
    }
    
}
