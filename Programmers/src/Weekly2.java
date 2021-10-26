package Algorithm;

public class Weekly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[][] scores = {
//				{100,90,98,88,65},
//				{50,45,99,85,77},
//				{47,88,95,80,67},
//				{61,57,100,80,65},
//				{24,90,94,75,65}
//				};
		
		int[][] scores = {
				{50, 90}, {50, 87}
				};
        String answer = "";
        int[] avg = new int[scores.length];
        int[] max = new int[scores.length];
        int[] min = new int[scores.length];
        
        //내가 유일한 최고점수를 줬을 경우
        //내가 유일한 최저점수를 줬을 경우
        
        //위 경우인경우 scores길이보다 1작은수로 나누기
        
        for(int i=0; i<scores.length; i++){
        	min[i] = 100;
            for(int j =0; j<scores.length; j++){
            	if(i==j)continue;
                if(scores[j][i]>max[i]){
                    max[i] = scores[j][i];
                }
                if(scores[j][i]<min[i]){
                    min[i] = scores[j][i];
                }
                avg[i] += scores[j][i];
            }
        }

        for(int i=0; i<scores.length; i++) {
        	int aver = 0;
//        	System.out.println(i);
        	if(scores[i][i] == max[i] || scores[i][i] == min[i]) { //내 점수가 유일하지 않을 때는 그냥 계산
        		aver = (int) Math.floor((avg[i] + scores[i][i])/scores.length);
            	System.out.println(Math.floor((avg[i] + scores[i][i])/scores.length));

        	}else if(scores[i][i]>max[i]||scores[i][i]<min[i]){ //내 점수가 유일할 때는 제외하고 계산
        		aver = (int)Math.floor(avg[i]/(scores.length -1));
            	System.out.println(Math.floor(avg[i]/(scores.length -1)));
        	}
        	else {
        		System.out.println(Math.floor((avg[i]+ scores[i][i])/(scores.length)));
        		aver = (int)Math.floor((avg[i]+ scores[i][i])/(scores.length));
        	}            	
        	if((aver/10)>8) answer += String.valueOf((char)65);
        	else if((aver/10)<7 &&(aver/10)>4) answer += String.valueOf((char)68);
        	else if((aver/10)<5) answer += String.valueOf((char)70);
        	else answer += String.valueOf((char)(74-(aver/10)));
        	
        }
        System.out.println(answer);
	}

}
