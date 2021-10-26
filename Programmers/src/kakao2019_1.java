package Algorithm;
import java.util.Stack; 
import java.util.Arrays;



public class kakao2019_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
        Stack<Integer> bucket = new Stack<>();
		boolean empty = bucket.empty();

     
        bucket.push(0);
        for(int move: moves){//열
            
           for(int j= 0; j<board.length; j++) { //행
           	System.out.println(" j=" + j + " i=" +  (move -1) );

    		   if(board[j][move-1] == 0) continue;
    		   else{
    			   if(bucket.peek() == board[j][move -1]){ //pop
      	                System.out.println("\npop" + bucket.peek());       	
      	                	bucket.pop();
      	                	answer += 2;
       		   		}else {
      	                bucket.push(board[j][move -1]);
      	                System.out.println("\npush" + board[j][move -1]);
       		   			}
        		   }
             		board[j][move -1] = 0;
                	break;
		   		}
        	   
        	   }
           
        
        System.out.println(answer);

	}

}
