package chapter08;

public class java02_Object_arr {
    public static void main(String[] args) {
        int[] nums = {4,1,3,5,2};
//        for(int i=0; i<nums.length - 1; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]<nums[j]){
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
        for(int j = nums.length - 1 ; j > 0;j--) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }



        for(int num : nums){
            System.out.println(num);
        }
    }
}
