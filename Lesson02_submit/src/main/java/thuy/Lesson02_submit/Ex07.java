package thuy.Lesson02_submit;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = 0;
		int dem = 0;
		int i = 0;
		int arr[] = new int[10];

		while (true) { // 20 - 30
			number = 20 + rd.nextInt(30 - 20 + 1);
			if (Test(arr, number)) {
				arr[i] = number;
				System.out.println(arr[i]);
				i++;
				dem++;

				if (dem == 5) {
					break;
				}
			} else {
				continue;
			}

		}
	}

	public static boolean Test(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return false;
			}
		}
		return true;
	}
}
