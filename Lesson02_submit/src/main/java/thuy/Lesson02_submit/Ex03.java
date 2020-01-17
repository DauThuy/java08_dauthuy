package thuy.Lesson02_submit;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n, mod, tmp;
		int reverse = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra doi xung: ");
		n = ip.nextInt();
		tmp = n;

		while (tmp != 0) {
			mod = tmp % 10;
			reverse = reverse * 10 + mod;
			tmp /= 10;
		}

		if (reverse == n)
			System.out.println(n + " la so doi xung");
		else
			System.out.println(n + " khong phai so doi xung");
	}
}
