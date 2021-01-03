public class InsertionSort {
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
    public static void main(String[] args){  
        int[] arr1 = {1,9,2,5,8,7,3,6,4};
        insertionSort(arr1);  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}
