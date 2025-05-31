package Javacode;

public class BuyandSellstock {
	//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
	//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
	//Find and return the maximum profit you can achieve.
	public static void main (String[]Args) {
		int[]prices= {1,2,3,4,5};
		
		//maxprofit(prices);
		System.out.println(maxprofit(prices));
	}
public static int maxprofit(int[]prices){
	int min=prices[0];
	int profit=0;

		
		for(int i=0;i<prices.length;i++) {
			if(min<prices[i]) {
				min=prices[i];
				
				
				
			}
			profit=Math.max(profit,prices[i]-min);
			
			
		}
		
		
		
		return profit;
		
		
		
	}
}




	
	
	

