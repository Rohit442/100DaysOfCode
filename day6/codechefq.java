

import java.util.*;
import java.lang.*;
import java.io.*;

public class codechefq
{
  static void merge (int arr[], int start, int mid, int end)
  {

    int l = mid - start + 1;
    int r = end - mid;

    int LeftArray[] = new int[l];
    int RightArray[] = new int[r];

    for (int i = 0; i < l; ++i)
        LeftArray[i] = arr[start + i];

    for (int j = 0; j < r; ++j)
        RightArray[j] = arr[mid + 1 + j];


    int i = 0, j = 0;
    int k = start;
    while (i < l && j < r)
      {
	if (LeftArray[i] <= RightArray[j])
	  {
	    arr[k] = LeftArray[i];
	    i++;
	  }
	else
	  {
	    arr[k] = RightArray[j];
	    j++;
	  }
	k++;
      }
    while (i < l)
      {
	arr[k] = LeftArray[i];
	i++;
	k++;
      }

    while (j < r)
      {
	arr[k] = RightArray[j];
	j++;
	k++;
      }
  }

  static void sort (int arr[], int start, int end)
  {
    if (start < end)
      {
	int mid = (start + end) / 2;
	sort (arr, start, mid);
	sort (arr, mid + 1, end);
	merge (arr, start, mid, end);
      }
  }
    public static void main (String[]args) throws java.lang.Exception
    {
        try{
      Scanner sc = new Scanner (System.in);
      int t = sc.nextInt ();
      int n;
      while (t > 0 && t < 11)
	{
	  n = sc.nextInt ();
	  if(n>0 &&n<=100){
	  int arr[] = new int[n];
	  for(int i =0;i<n;i++){
	      arr[i]=sc.nextInt();
	  }
	    sort (arr, 0, arr.length - 1);
	  for (int i = 1; i <= arr.length; i++)
	    {
	      if (arr[i - 1] != i * i)
		{
		  System.out.println (i * i);
		  break;
		}
	    }
	}
	}
    }
    catch(Exception e){
        return;
    }
    }
  }