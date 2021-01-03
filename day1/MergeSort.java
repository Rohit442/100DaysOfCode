public class MergeSort  
{  
void merge(int arr[], int start, int mid, int end)  
{  
  
int l = mid - start + 1;  
int r = end - mid;  
  
int LeftArray[] = new int [l];  
int RightArray[] = new int [r];  
  
for (int i=0; i<l; ++i){ 
LeftArray[i] = arr[start + i];  }
  
for (int j=0; j<r; ++j)  {
RightArray[j] = arr[mid + 1+ j];  }
  
  
int i = 0, j = 0;  
int k = start;  
while (i<l&&j<r)  
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
while (i<l)  
{  
arr[k] = LeftArray[i];  
i++;  
k++;  
}  
  
while (j<r)  
{  
arr[k] = RightArray[j];  
j++;  
k++;  
}  
}  
  
void sort(int arr[], int start, int end)  
{  
if (start<end)  
{  
int mid = (start+end)/2;  
sort(arr, start, mid);  
sort(arr , mid+1, end);  
merge(arr, start, mid, end);  
}  
}  
public static void main(String args[])  
{  
int arr[] = {10,24,11,23,1,20,12,13,9,5,2,4};  
MergeSort ob = new MergeSort();  
ob.sort(arr, 0, arr.length-1);
for(int i =0; i<arr.length;i++)  
{  
    System.out.print(arr[i]+" ");  
}  
}  
}  