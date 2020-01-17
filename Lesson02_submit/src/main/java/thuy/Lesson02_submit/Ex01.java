package thuy.Lesson02_submit;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		int c = 8;
		int tmp;

		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}
