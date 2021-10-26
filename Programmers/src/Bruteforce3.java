package Algorithm;
import java.util.Arrays;

public class Bruteforce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown=10;
		int yellow =2;

        int AplusB = (brown + 4)/2;
        int AmulB = brown + yellow;
        
        int width = (int) Math.ceil((double)AplusB/2);
        int height = AplusB/2;
        
        System.out.println(width + " " + height);
        
        while(true){

            if((width+height) == AplusB && (width*height) == AmulB) break;
            width++;
            height--;

        }
        int[] answer = {width, height};
        
        
        System.out.println(Arrays.toString(answer));
	}

}
