package daa;
import java.util.*;

public class linearSearch {
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    } 

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter number of elements\n");
        int n=sc.nextInt();  
        int[] a1= new int[n];  
        System.out.println("Enter the array elements\n");
        for(int i=0;i<n;i++)
        	a1[i]=sc.nextInt();
        System.out.println("Enter the key element\n");
        int key = sc.nextInt();    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    

