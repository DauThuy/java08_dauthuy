package thuy.Lesson02_submit;

public class Ex06 {
	public static void main(String[] args) {
		int dem = 0;

		for (int i = 0;; i++) {
			if (isPrime(i)) {
				dem++;
			}
			if (dem == 200) {
				System.out.println("So nguyen to thu " + dem + " la: " + i);
				break;
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
