class Solution {
    public int maxProfit(int[] prices) {
        // int []arr= Arrays.copyOf(prices,prices.length);
        // Arrays.sort(arr);
        int buy = prices[0];
        int max=0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            max = Math.max(max,prices[i]-buy);
        }
        
        // for(int i = day; i < prices.length; i++){
        //     int count = prices[i]-low;
        //     max = Math.max(max, count);
        // }
        return max;
    }
}