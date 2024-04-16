package arrayrotate;
import java.util.*;

public class ArrayRotate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};  
        int t = 3;
        
        // Create a new array to store the rotated values
        int arr1[] = new int[arr.length];
        
        // Rotate the array to the left by 't' positions
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + t) % arr.length; // Calculate the new index after rotation
            arr1[i] = arr[newIndex]; // Assign the rotated value to the new array
        }
        
        // Assign the rotated array back to the original array if needed
        
        
        // Print the rotated array
        System.out.println(Arrays.toString(arr1));
    }
}
