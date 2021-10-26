package Algorithm;
//import java.Arrays.*;
import java.util.*;

public class Bruteforce1 {


	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
        List<Integer> ans = new ArrayList<>();
        int[] score = {0,0,0};
        //수포자1,2,3 패턴 정의
        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == pattern1[i%5])
                score[0]++;
            if(answers[i] == pattern2[i%8])
                score[1]++;
            if(answers[i] == pattern3[i%10])
                score[2]++;
        }
        
        //score의 max값 찾기
        int max = Arrays.stream(score).max().getAsInt();
        int idx;
        
        for(int i=0; i<score.length; i++){
            if(score[i] == max){
                ans.add(i);
            }
        }
        
        int[] answer = new int[ans.size()];
        for(int i =0; i<ans.size(); i++){
            answer[i] = ans.get(i)+1;
        }
	    
	}
}
