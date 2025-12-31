class Practice {
    public static void swap(int []nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static int maxRange(int [] nums, int start, int end){
        int max = nums[0];
        if(nums.length == 0){
            return -1;
        }
        if(start > end){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(max< nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    
    public static void reverse(int [] nums, int start, int end){
        //two pointer method
        while(start <= end){
            // int temp = nums[start];
            // nums[start] = nums[end];
            // nums[end] = temp;
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 23, 42, 6, 9};
        System.out.println("Before swapping : ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        swap(arr, 1,3);
        System.out.println("After swapping : ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Max in the given range = "+maxRange(arr, 1,3));
        reverse(arr, 0, 4);
        System.out.println("After reversing : ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
