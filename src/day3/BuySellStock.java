package day3;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int maximumSell=0;
        int cnt=0;
        int p = prices.length;
        for(int i=0;i<p-1;i++){
            cnt=cnt+prices[i+1]-prices[i];
            if(cnt<0)
                cnt=0;
            if(cnt>=0&&cnt>=maximumSell)
                maximumSell=cnt;
        }
        return maximumSell;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        BuySellStock bss = new BuySellStock();
        int maxProfit = bss.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
