class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length;i++){
            int ex = candies[i]+extraCandies;
            if(ex >= max){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}