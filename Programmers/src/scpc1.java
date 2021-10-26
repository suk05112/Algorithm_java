package Algorithm;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Runtime;

public class scpc1 {

	static int Answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		System.out.println("input T");

		for(int test_case = 0; test_case < T; test_case++) {
			
			 Answer = 0;
			int Dlength = sc.nextInt();

			int[] numbers = new int[Dlength];
			
			
			boolean[] chk = new boolean[Dlength];
			boolean[][] relation = new boolean[Dlength][Dlength];
			System.out.println("total memory" + Runtime.getRuntime().totalMemory());

			for(int i=0; i<Dlength; i++) {
				numbers[i]= sc.nextInt();
			}
			
			//연결에 대한 2차원정보 relation 필요
			for(int i=0; i<Dlength; i++) {
				if((i+numbers[i])<Dlength) {
					relation[i][(i+numbers[i])] = true;
					relation[(i+numbers[i])][i] = true;
				}
				relation[i][i] = true;
			}
			
			for(int i=0; i<Dlength; i++) {
				System.out.println(Arrays.toString(relation[i]));	
			}
			
			for(int i=0; i<Dlength; i++) {
				if(!chk[i]) {
	                dfs(relation, chk, i);
					Answer++;
	            }
			}

			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			numbers = null;

			chk = null;
			relation = null;
			
		}
	}
	
	static void dfs(boolean[][] relation, boolean[] chk, int start) {
	
		chk[start] = true;
        for(int i = 0; i < relation.length; i++) {
            if(relation[start][i] == true && !chk[i]) {
                dfs(relation, chk, i);
            }
        }
	}

}
