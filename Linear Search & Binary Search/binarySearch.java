package daa;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch{  
	 public static int binarySearch(int arr[], int first, int last, int key){  
	   int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < key ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == key ){  
	    	  
	    	  return mid;
	        
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
	   return -1;
	 }
	 
	 public static int binarySearchRecursion(int arr[], int first, int last, int key){  
	        if (last>=first){  
	            int mid = first + (last - first)/2;  
	            if (arr[mid] == key){  
	            return mid;  
	            }  
	            if (arr[mid] > key){  
	            return binarySearch(arr, first, mid-1, key);//search in left subarray  
	            }else{  
	            return binarySearch(arr, mid+1, last, key);//search in right subarray  
	            }  
	        }  
	        return -1;  
	    }  
	 
	 public static void main(String args[]){  
		 Scanner sc=new Scanner(System.in);  
	        System.out.println("Enter number of elements\n");
	        int n=sc.nextInt();  
	        int[] a1= new int[n];  
	        System.out.println("Enter the array elements\n");
	        for(int i=0;i<n;i++)
	        	a1[i]=sc.nextInt();
	        System.out.println("Enter the key element\n");
	        int key = sc.nextInt();   
	        int last=a1.length-1;  
	       
	         System.out.println("Key is found at index: "+binarySearch(a1,0,last,key)+" using iterative approach");
	        
	         System.out.println("Key is found at index: "+binarySearchRecursion(a1,0,last,key)+" using Recursion approach");   
	        	
	         System.out.println("Key is found at index: "+Arrays.binarySearch(a1,key)+" using Arrays.binarySearch() method");  
	        if(Arrays.binarySearch(a1,key)<0)
	        	System.out.println("Element not found!");
	}
}
