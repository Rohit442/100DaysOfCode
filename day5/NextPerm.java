class NextPerm{
    public static void nextPermutation(int[] nums) {
    
        int len = nums.length;        
        int l = 0;        
        for(int i = len - 2; i >= 0; i--){            
            if(nums[i] < nums[i + 1]){
                for(int j = len - 1; j > i; j--){
                    if(nums[j] > nums[i]){
                        swap(nums, i, j);
                        l = i + 1;                       
                        break;
                    }
                }
            }            
            if(l == i + 1){
                break;
            }
        }        
        // revese the array        
        int r = len - 1;   
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main{
        System.out.println(nextPermutation({1,2,3}));
    }

}