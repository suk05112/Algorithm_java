package Algorithm;
import java.util.*;

public class boost {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,3,3,3,4,4};
//		int[] arr = {3,2,4,4,2,5,2,5,5};

		int[] arr = {3,5,7,9,1};
		int a;
		
		Set<Integer> set = new HashSet<>();
		for(int i: arr) {
			set.add(i);
		}
		
		Iterator<Integer> iter = set.iterator();
		int[] answer = new int[set.size()];
		
		for(int i=0; i<set.size(); i++) {
			a = iter.next();
			for(int j=0; j<arr.length; j++) {
				if(a == arr[j]) {
					System.out.println(a);

					answer[i]++;
				}
			}
		}
 
		int[] ans = Arrays.stream(answer).filter(i -> i>1).toArray();
		
		if (ans.length == 0) {
            ans = new int[]{-1};
		}

		System.out.println(Arrays.toString(ans));

	}

}
