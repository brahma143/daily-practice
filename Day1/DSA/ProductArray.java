import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {

        int nums[] ={1,2,3,4};

       //int[] res= productArray(nums);
        //OptimzeProduct Array
       int[] res2= optimizeProductArray(nums);
        System.out.println(Arrays.toString(res2));
    }
    static int[] optimizeProductArray(int[] nums){

        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        left[0]=1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1]*nums[i-1];
        }
        System.out.println(Arrays.toString(left));

        right[n-1]=1;
        for (int i = n-2; i >= 0 ; i--) {
            right[i] = right[i+1]*nums[i+1];

        }
        System.out.println(Arrays.toString(right));

        for (int i = 0; i < n; i++) {
            prod[i] = left[i]*right[i];
        }

        return prod;
    }
    static int[] productArray(int[] nums){
        int n=nums.length;
        int[] prod = new int[n];

        for (int i = 0; i <n ; i++) {
            int mul=1;
            for (int j = 0; j < n; j++) {

                if(nums[i]==nums[j]){

                }else{
                    mul *= nums[j];
                }
                prod[i] =mul;
            }
            //fun(nums,i);
        }
        return prod;
    }
    static void fun(int[] nums, int i){

        int n= nums.length-1;
         int mul=1,k=0;
        while(n >= k ) {
            if (nums[k] == i) {
                System.out.println(nums[k]+" "+i);
            } else {
               mul *=nums[k];
            }
            k++;
        }
        nums[i]=mul;
    }
}
