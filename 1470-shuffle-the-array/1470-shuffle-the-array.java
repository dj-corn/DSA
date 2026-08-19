class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        // Method ---> 1
        // Method ---> 1
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     arr.add(nums[i]);
        //     arr.add(nums[i+n]);
        // }
        // int[] ans = arr.stream().mapToInt(Integer::intValue).toArray();
        // return ans;
        

        // Method ---> 2
        // Method ---> 2
        int [] ans = new int[2*n];
        int j =0;
        for(int i=0; i<2*n; i++){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
            i++;
        }
        return ans;
    }
}