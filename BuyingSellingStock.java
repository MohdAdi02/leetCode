public class BuyingSellingStock {
    public void maxProfit(int[] prices) {

        int buy_price = prices[0];
        int profit =0;
        int currentProfit =0;

        for(int i =1; i < prices.length; i++) {

            if (prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                currentProfit = prices[i] - buy_price;
                profit = Math.max(currentProfit, profit);
            }
        }
                System.out.println(profit);

//        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {2,4,1};
        BuyingSellingStock bss = new BuyingSellingStock();
        bss.maxProfit(prices);
    }
}
