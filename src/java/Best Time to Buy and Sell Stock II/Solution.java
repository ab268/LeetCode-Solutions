public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int buy=prices[0];
        int sell = prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=sell){
                sell=prices[i];
            }
            else {
                profit=profit+(sell-buy);
                buy=prices[i];
                sell=prices[i];
            }
        }
        profit=profit+(sell-buy);
    
        return profit;
    }
}