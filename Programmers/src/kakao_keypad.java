package Algorithm;

import java.util.Arrays;

public class kakao_keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
//		int[] numbers =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

		int[][] location = { { 3, 1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 },
				{ 2, 2 } };

		String hand = "left";
		String answer = "";
		int[] loc_left = { 3, 0 };
		int[] loc_right = { 3, 2 };
		int[] loc_find = { 0, 0 };

		int a = 0;
		int b = 0;
		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) {
				answer = answer + "L";
				loc_left = location[number];
			} else if (number == 3 || number == 6 || number == 9) {
				loc_right = location[number];
				answer = answer + "R";
			} else {
				loc_find = location[number];
				int left_distance = Math.abs(loc_left[0] - loc_find[0]) + Math.abs(loc_left[1] - loc_find[1]);
				int rigth_distance = Math.abs(loc_right[0] - loc_find[0]) + Math.abs(loc_right[1] - loc_find[1]);

				if (left_distance > rigth_distance) {
					answer = answer + "R";
					loc_right = location[number];

				} else if (left_distance < rigth_distance) {
					answer = answer + "L";
					loc_left = location[number];

				} else {
					if (hand.equals("right")) {
						answer = answer + "R";
						loc_right = location[number];

					} else {
						answer = answer + "L";
						loc_left = location[number];

					}

				}

			}

		}
		System.out.println(answer);

//		System.out.println("LRLLLRLLRRL");
		System.out.println("LRLLRRLLLRR");
//        System.out.println("LLRLLRLLRL");

	}

}
