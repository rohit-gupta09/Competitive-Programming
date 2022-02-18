package dsa_Practice;
import java.util.*;

public class QuickSort {
	public static void quickSort(int[] arr, int lo, int hi) {
	    
		if(lo>hi)
		{
			return;
		}
		int pivot=arr[hi];
		int piv=partition(arr,pivot,lo,hi);
		quickSort(arr,lo,piv-1);
		quickSort(arr,piv+1,hi);
    
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
    	  
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    return (j - 1);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    quickSort(arr, 0, arr.length - 1);
    print(arr);
  }

}
