package Algorithm;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class skill1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 118372;
		long answer = 0;
      
        int arr[] = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr2, Collections.reverseOrder());
        
        arr = Arrays.stream(arr2).mapToInt(Integer::intValue).toArray(); 

        
        long num = Long.parseLong(Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));

        System.out.println(num);
	}

}
