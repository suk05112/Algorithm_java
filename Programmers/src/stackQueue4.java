package Algorithm;
import java.util.Arrays;
import java.util.Stack; //import

public class stackQueue4 {
	
	static class Price{
        int price;
        int idx;
        
        public Price(int price, int idx){
            this.price = price;
            this.idx = idx;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1, 2, 3, 2, 3};
		 int[] answer = new int[prices.length];
	        
	        Stack<Price> stack = new Stack<>();
	        int i=0;
	        int time = 1;
	        prices[prices.length-1] = 0;

	        while(i<prices.length){

	        	if(stack.empty()) {
	                stack.push(new Price(prices[i], i));
		        	System.out.println("push " + prices[i] + " " + i);

	        	}
	            else if(stack.peek().price<=prices[i]){ //가격이 올랐을 경우
	                stack.push(new Price(prices[i], i));
		        	System.out.println("push " + prices[i] + " " + i);

	            }
	            else if(stack.peek().price>prices[i]){ //가격이 내렸을 경우
	                prices[i] = 1;
	                while(stack.peek().price>prices[i]){
	                    prices[stack.peek().idx] = time - stack.peek().idx;
	                    stack.pop();   
	                }
	                System.out.println("가격 내림");
	                
	            }
	            i++;
	            time++;
	            System.out.println("time " + time);
	        }
	        while(!stack.empty()){
	            int idx = stack.peek().idx;
	            stack.pop();
	            answer[idx] = time-idx;
	            System.out.println("while");
	        }
	        
        	System.out.println("answer " + Arrays.toString(answer));

	}

}
