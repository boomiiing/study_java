package chapter08;

public class java03_Object_arr {
    public static void main(String[] args) {
        int[] nums = {4,1,3,5,2};
        for(int j=nums.length ;j > 0;j--) {
            int maxIndex = 0;
            for (int i = 1; i < j ; i++) {
                if (nums[maxIndex] < nums[i]) {
                    maxIndex = i;
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[j - 1];
            nums[j - 1] = temp;
        }
        for(int num : nums){
            System.out.println(num);
        }
    }
}
