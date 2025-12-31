class Swapnums {
    public static void swap(int []nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {1, 23, 42, 6, 9};
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        swap(arr, 1,3);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
