package Algorithm;

public class dfsbfs3 {

	static int answer = 0;

	static boolean [] visit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String begin = "hit";
		String target ="cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		visit = new boolean[words.length];
		dfs(begin, target, words, 0);
		System.out.println(answer);
	}
	
	public static void dfs(String begin, String target, String words[], int cnt) {
		System.out.println(begin + " " + target);
		if(begin.equals(target)) {
			answer = cnt;
			return;
		}
		
		for(int i=0; i<words.length; i++) {
            if (visit[i]) {
                continue;
            }
    		int k = 0;

			//한글자만 차이나는지 체크
			for(int j=0; j<target.length(); j++) {
				if(begin.charAt(j) == words[i].charAt(j)) {
					System.out.println("chk");

					k++;
				}
			}
			
			//한글자만 차이나면 bfs
			if(k+1 == target.length()) {
				System.out.println(words[i]);
				visit[i] = true;
				dfs(words[i], target, words, cnt+1);
				visit[i] = false;
			}
		}
	}

	
}
