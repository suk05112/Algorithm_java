package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class mobis1 {
	static int[][] dice = {{1, 6, 2, 5, 3, 4}, {9, 9, 1, 0, 7, 8}};
    static HashSet<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean[] visit = new boolean[dice.length];

        for(int i = 0; i < dice.length ; i++) {
        	for(boolean b: visit) {
        		b = false;
        	}
        	dfs(0, visit, dice.length);
    		System.out.println("out for");

        }
//    	dfs(0, visit, dice.length);


    	List<Integer> sortSet = new ArrayList(set);
    	Collections.sort(sortSet);
    	for(int i: sortSet) {
    		System.out.print(i + " ");
    	}
	}
	
	public static void dfs(int prefix, boolean[] visit, int cnt) { //num: 몇개 뽑아야 하는
		
		if(cnt==0)return;

        for(int i = 0; i < dice.length ; i++) {
			if(visit[i]==false) { //사용안한 주사위이면
				visit[i] = true; //사용하고
				for(int j: dice[i]) {
					set.add(prefix*10 + j);
			    	dfs(prefix*10 + j, visit,  cnt-1);
				}
			}
			System.out.println(Arrays.toString(visit));

		}

    }	


}
