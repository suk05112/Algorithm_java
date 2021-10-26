package Algorithm;



public class Weekly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 2;
		int money = 20;
		int count = 4;
        long answer = -1;
        int sum=0;
        
        for(int i=1; i<count+1; i++) {
        	sum += i*price;
        }
        
        if(sum<money) System.out.println(0);
        else System.out.println(Long.valueOf(sum-money));

//        2 4 6 8
	}

}
