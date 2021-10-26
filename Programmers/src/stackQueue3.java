package Algorithm;
import java.util.LinkedList;
import java.util.Queue; 

public class stackQueue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
//		int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int answer = 0;
        int now_weight = 0; //현재 무게
        int i=0;
        
        String qu = "";
        
        Queue<Integer> que = new LinkedList<>();

        while(i<truck_weights.length){
            
            if(que.size()<bridge_length){
                if((now_weight + truck_weights[i]) <= weight){
                    que.add(truck_weights[i]);
                    qu += truck_weights[i] + " ";
                    now_weight += truck_weights[i];
                    i++;
                }
                else{ 
                	que.add(0);
                	qu += "0 ";
                	}
                answer++;

            }else{
                // que.remove(); 
                now_weight -= que.poll();
                System.out.println("else");
            }

            System.out.println("now weight = " + now_weight + " i = " + i);
            System.out.println(qu);
        }
        

        System.out.println(que.size());
        System.out.println("answer = " + answer);
	}

}
