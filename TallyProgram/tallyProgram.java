import java.util.Scanner;

class tallyProgram {

	static String input;
	static char[] split;
	static int[] points;

	public static void prompt() {
		System.out.println("Points:");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine().toLowerCase();
	}

	public static void split() {
		split = input.toCharArray();
	}

	public static void calculate() {
		points = new int[5];
		for (int i = 0; i < split.length; i++) {
			points[split[i] - 97]++;
		}
	}

	public static void print() {
		for (int i = 0; i < 5; i++) {
			System.out.print((char)(i + 97) + ": " + points[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		prompt();
		split();
		calculate();
		print();
	}

}