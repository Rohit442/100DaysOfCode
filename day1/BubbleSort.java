public class BubbleSort {
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
}
public static void main(String[] args){  
    int[] arr1 = {1,9,2,5,8,7,3,6,4};
    bubbleSort(arr1);  
    for(int i:arr1){  
        System.out.print(i+" ");  
    }  
}  
}  