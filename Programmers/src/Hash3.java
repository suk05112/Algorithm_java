package Algorithm;
import java.util.HashMap;

public class Hash3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
	        int answer = 1;
	        
	        HashMap<String,Integer> map = new HashMap<String,Integer>();

	        for(int i=0; i<clothes.length; i++){
	            String key = clothes[i][1];

	            System.out.println(key);
	            if(map.containsKey(key)){
	                map.put(key, map.get(key) + 1);
	            }
	            else{
	                map.put(key, 1);

	            }
	        }
	        System.out.println(map);
	        for(String kind : map.keySet()){ //저장된 key값 확인
	            answer *= (map.get(kind)+1);

	        }
	        System.out.println(answer -1);
	    
	}

}
