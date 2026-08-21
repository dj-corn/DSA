class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            ans.add(index[i],nums[i]);
        }
        nums = ans.stream().mapToInt(Integer::intValue).toArray();
        return nums;
    }
}