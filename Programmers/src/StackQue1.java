package Algorithm;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;

public class StackQue1 {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = new int[progresses.length];
		answer = solution(progresses, speeds);
        System.out.println("answer" + Arrays.toString(answer));


	}
	
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int count = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int finish = 0;
        int ans = 0;
        
        while(finish<progresses.length){
            count = 0;
            for(int i=finish; i<progresses.length; i++){
                progresses[i] += speeds[i]; //하루 지날 떄마다 작업
                if (progresses[i] > 100 && !priorityQueue.contains(i)){ //작업 완료되면 큐에 집어넣기
                	priorityQueue.add(i);
                }
            }
            System.out.println("progress" + Arrays.toString(progresses));

            System.out.println("finish" + finish );

            while(finish<progresses.length){

                if(progresses[finish]>99){
                    priorityQueue.poll();
                    count++;
                    System.out.println("finish" + progresses[finish] + " count =" + count );
                    finish++;
                }else{
                	if(answer[ans] != 0) {
                		ans = ans + 1;
                	}
                    break;
                }

            }
            answer[ans] = count;

        }
        System.out.println("peek" + priorityQueue.peek() + ans);

        int[] re = new int[ans+1];
        for(int i=0; i<ans; i++) {
        	if(answer[i]!=0){
                re[i] = answer[i];

            }
    	}
        


        System.out.println("ans" + Arrays.toString(answer));

        
        return re;
    }
}
