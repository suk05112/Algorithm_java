package Algorithm;
import java.util.HashSet;


//find sosu
public class Bruteforce2 {

	public static void main(String[] args) {


		String numbers = "9999";
		int answer = 0;
		int count = 0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		permutation("", numbers, set);
		
		System.out.println(set.size());
        System.out.println(set.toString());
		
		
		while(set.iterator().hasNext()){
			System.out.println("while");
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count += 1;
            if(a%2!=0 && checksosu(a)){
                count += 1;
            }
		}
		
		System.out.println(count);
		
	}
	
	
	//조합만드는 재귀함수
	static void permutation(String prefix, String num, HashSet<Integer> set) {
		int n = num.length();
		if(!prefix.equals("")) {
			set.add(Integer.parseInt(prefix));
		}
		
		for(int i=0; i<num.length(); i++) {
			permutation(prefix + num.charAt(i), num.substring(0, i) + num.substring(i+1, n), set);
		}
		
	}
	//소수찾는 함수
	
	static boolean checksosu(int n) {
		if(n==0 || n==1) return false;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
		
	}

}
