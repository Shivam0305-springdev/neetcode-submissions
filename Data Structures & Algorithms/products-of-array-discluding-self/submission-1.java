class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[nums.length];

        int prodBeforeCurr = 1;
        int prodAfterCurr = 1;

        for(int i = 0; i < n; i++) {
            res[i] = prodBeforeCurr;
            prodBeforeCurr *= nums[i];
        }


        for(int i = n - 1; i >= 0; i--) {
            res[i] *= prodAfterCurr;
            prodAfterCurr *= nums[i];
        }

        return res;
    }
}  
