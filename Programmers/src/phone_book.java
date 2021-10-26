package Algorithm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class phone_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = true;
        //해시에 전화번호 저장
        //가장 짧은 전화번호부터 검사?
//		String[] phone_book ={"119", "97674223", "1195524421"};
		String[] phone_book ={"12","123","1235","567","88"};
        Map<String, String> map = new HashMap<String, String>();

        Arrays.sort(phone_book);        
        
        for(String temp: phone_book) {
        	map.put(temp, temp);
        }
        
        System.out.println(Arrays.toString(phone_book));
		
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
            	String temp = phone_book[i].substring(0, j);                
                if( map.containsKey( temp ) ){
                	System.out.println("false");
//                    return false;
                }   
            }
        }

	}

}
