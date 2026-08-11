class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    int []arr = {i,j};
                    return arr;
                }
            }
        }
        return nums;
    }
}