package Algorithm;
import java.util.*;

public class stackQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;

		int answer = 0;
        PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<priorities.length; i++){
            priority.add(priorities[i]);
        }
        System.out.println(priority);
//        System.out.println(priority.peek());

        boolean flag = true;

        while(!priority.isEmpty()){
        	
            for(int i=0; i<priorities.length; i++){
            	System.out.println(i);
            	
                if(!priority.isEmpty() && priorities[i] == priority.peek()){
                	System.out.println("peek" + priority.peek());
                    priority.poll();
                    answer++;
                    if(location == i) priority.clear();
                }
            }
        }
        
//        while(!priority.isEmpty()){
//            for(int i=0; i<priorities.length; i++){
//                if(priorities[i] == (int)priority.peek()) {
//                    if(i == location){
//                    }
//                    priority.poll();
//                    answer++;
//                }
//            }
//        }
        
        System.out.println(answer);
	}

}
