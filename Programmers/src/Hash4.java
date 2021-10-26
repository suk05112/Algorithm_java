package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;


public class Hash4 {
	
    static class Music{
        int play;
        int idx;

        public Music(int play, int idx) {
            this.play = play;
            this.idx = idx;
        }
    }

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
//		
//		String[] genres = {"A", "A", "B", "A", "B", "B", "A", "A", "A", "A"};
//		int[] plays = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        Queue<Integer> que = new LinkedList<>();

        for (int i=0; i<genres.length; i++) {
        	String key = genres[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key) + plays[i]);
            }
            else{
                map.put(key, 0);

            }
        }


        while(!map.isEmpty()) {
            String genre = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
            System.out.println(genre);
            map.remove(genre);
            
            ArrayList<Music> list = new ArrayList<>();
            
            for(int i=0; i<genres.length; i++) {
            	if (genres[i].equals(genre)) {
            		list.add(new Music(plays[i], i));
            	}
            }
            
        	Collections.sort(list,  (o1, o2) -> o2.play - o1.play);
        	for(Music s : list) {
    			System.out.println(s.play + " " + s.idx);
    		}

        	que.add(list.get(0).idx);
            if(list.size()!=1){ 	
            	que.add(list.get(1).idx);
            }

        }

        int[] answer = new int[que.size()];
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println("peek" + que.peek());
        	answer[i] = que.poll();
        }

        System.out.println(Arrays.toString(answer));


	}

}
	
