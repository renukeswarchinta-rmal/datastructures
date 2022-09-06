package arrays;
//  [ 7,1,4,3,6,2] ---> In this array if we buy at price and sell at proce 6 then we get maximum profilt
public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
        System.out.println(bestTimeToBuyAndSell.maxProfit(new int[]{7,1,4,3,6,2}));
    }
    public int maxProfit(int[] prices) {
        // if the given array is empty return 0
        if (prices.length == 0) return 0;
        // initialize maxProfit to 0
        int maxProfit = 0;
        // we are storing the buying price & keep it smaller
        int buyAt = prices[0];
           for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-buyAt);
            // if buy price greater than current price, then set buyAt = currentPrice
            if (buyAt > prices[i]) {
                buyAt = prices[i];
            }
        }
        return maxProfit;
    }
}

