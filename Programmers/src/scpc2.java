package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class scpc2 {
	static int Answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			 Answer = 0;
			 int n = sc.nextInt();
			 int t = sc.nextInt();
			 String B = sc.next();
			 int[] A = new int[n];
			 boolean[] select = new boolean[n];

			 for(int i=0; i<n; i++) {
				 A[i] = -1;
				 select[i] = true;
			 }

			 for(int i=0; i<n; i++) {
				 if(i<t) {
					 if(B.charAt(i) == '1') {A[i+t] = 1;}
					 else {A[i+t] = 0;}
					 select[i+t] = false;
					 
				 }else if(n-t-1<i) {
					 if(B.charAt(i) == '1') {A[i-t] = 1;}
					 else {A[i-t] = 0;}
					 select[i-t] = false;
					 
				 }else {
						if(B.charAt(i) == '1') {
							 System.out.println("case 1 ");

							if(select[i+t]== true && select[i-t]==true) {
								A[i+t] = 1;
								A[i-t] = 0;
							}else if(select[i+t]== false || select[i-t]==false) {
								if(select[i+t]== false && A[i+t] == 0) {A[i-t] = 1;}
								else if(select[i-t]==false && A[i-t] == 0) {A[i+t] = 1;}
//								A[i+t] = 1;
//								A[i-t] = 0;
							}
							 select[i+t] = false;
							 select[i-t]= false;
							 
							 
						 }else {
							 A[i+t] = 0;
							 A[i-t] = 0;
							 
							 select[i+t] = false;
							 select[i-t] = false;

						 } 

				 }
				 System.out.println("value A " + i + " " + Arrays.toString(A));
				 System.out.println(Arrays.toString(select));
			 }
			 System.out.println(Arrays.toString(select));
//			 System.out.println("value A " + Arrays.toString(A));
			 String ans="";
			 for(int i=0; i<n; i++) {
//
//				 if(select[i]== true) {
//					 ans+='0';
//				 }else {
//					 ans+=Integer.toString(A[i]);
//				 }
				 ans+=Integer.toString(A[i]);

			 }

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(ans);
		}
		
	}

}
