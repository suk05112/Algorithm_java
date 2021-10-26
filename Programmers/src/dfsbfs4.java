package Algorithm;
import java.util.Arrays;

public class dfsbfs4 {
//	static String [][]tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
	static String [][]tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
	static String []answer = new String[tickets.length];
	static String ans = "";
	
	public static void main(String[] args) {

		boolean []visited = new boolean[tickets.length];
		ans += "ICN";
		dfs("ICN", visited);
		
		
		System.out.println(ans);
	}
	
	static void dfs(String source, boolean []visited) {
		int idx = 0;
		String[] destination = {"", ""};
		String next = "next";
		System.out.println(Arrays.toString(visited));

		System.out.println("source = " + source);
		for(String []ticket: tickets) {
			if(source.equals(ticket[0])&& visited[idx] == false) {
				destination = ticket;
				next = ticket[1];
				idx = Arrays.asList(source).indexOf(ticket);
				break;
			}//endOF if
		}
	
		for(String []ticket: tickets) {

			if(source.equals(ticket[0])) {
				System.out.println("destination " +destination[0] + " " + destination[1]);
				System.out.println("비교 " +destination[1] + " " + ticket[1]);

				if (destination[1].compareTo(ticket[1]) > 0) {
					destination = ticket;
					idx = Arrays.asList(tickets).indexOf(ticket);
				}
			}
			System.out.println("선택 한것 " +destination[0] + " " + destination[1] + "\n");

		}
		
		if(visited[idx] == false) {
			visited[idx] = true;
			ans += " " + destination[1];
			dfs(destination[1], visited);
		}
	}

}
