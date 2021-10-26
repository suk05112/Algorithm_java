package Algorithm;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Iterator;


public class heap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int[][] jobs =  {{0, 3}, {1, 9},{2, 6}};
		int end = 0;
		int count = 0;
		int i = 0;

		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
		Iterator iter =pq.iterator(); 
		

//		System.out.println(Arrays.deepToString(jobs));

		Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); //요청이 들어온 순으로 정렬
		
		while(count < jobs.length) {

			while(i<jobs.length && jobs[i][0]<=end) {
				pq.add(jobs[i++]);
				System.out.println("add");
			}
			
			if(pq.isEmpty()) { //첫 작업
				end = jobs[i][0];
				System.out.println("first");
			}
			else{
				int[] temp = pq.poll();
				answer += temp[1] + end - temp[0];
				end += temp[1];

				count++;
				System.out.println("else " + answer);
			}
//			System.out.println(i);
			System.out.println("end" + end);

		}
//		System.out.println("answer = " + answer);
		System.out.println(answer/jobs.length);

		
//		for(int[] i: pq) {
//			System.out.println(Arrays.toString(i));
//		}
//		
//		
//		while(iter.hasNext()) {
//			int[] a = iteer.next();
//			System.out.print(Arrays.deepToString(a[0]) + " "); 
////			System.out.println(pq.poll());
//
//
//		}
		
	}


}
