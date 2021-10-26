package Algorithm;
import java.util.stream.Stream; 
import java.util.Arrays;

public class kakao_tuple {
	
	public static void main(String args[]) {
//	String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//	String s = "{{123}}";
	String s = "{{20,111},{111}}";
    int max=0;
    
    //','기준으로 새로운 배열에 집합을 담은 후
    String[] set = s.split("}");
    String tuple ="";

    //{} 추출
    for(int i=0; i< set.length; i++){
        set[i] = set[i].replace("{","");
        if(set[i].startsWith(","))
        	set[i] = set[i].substring(1);
        System.out.println(set[i]);

    }        
    
    String tmp;
    for(int i=0; i<set.length-1; i++){
        for(int j = i+1; j<set.length; j++){
            if(set[i].length()>set[j].length()){
                tmp = set[i];
                set[i] = set[j];
                set[j] = tmp;
            }
        }
    }
    System.out.println("set " + Arrays.toString(set));

    int[] answer = new int[set.length];
	System.out.println("len =" + answer.length);
	answer[0] = Integer.parseInt(set[0]);

	//여러 원소 중 포함하고 있지 않는 
    for(int i=1 ; i<answer.length; i++) { //원소의 개수만큼 반
    	for (String a: set[i].split(",")) {
        	System.out.println("a =" + a);

    		if(!Arrays.asList(set[i-1].split(",")).contains(a)) {
    			System.out.println("add");
    	    	answer[i] = Integer.parseInt(a);
    	        System.out.println(Arrays.toString(answer));

    		}
    	}
    	
    }

    System.out.println(Arrays.toString(set));
    System.out.println(Arrays.toString(answer));

	}

}
