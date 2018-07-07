import java.util.Scanner;
import java.util.ArrayList;

class createADiceRoller {

	static ArrayList<String> inputs = new ArrayList<String>();
	static int[] diceNum;
	static int[] diceType;

	public static void prompt() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toLowerCase();
		if (!input.equals("done")) {
			inputs.add(input);
			prompt();
		}
	}

	public static void split() {
		diceNum = new int[inputs.size()];
		diceType = new int[inputs.size()];
		for (int i = 0; i < inputs.size(); i++) {
			String[] split = inputs.get(i).split("d");
			diceNum[i] = Integer.parseInt(split[0]);
			diceType[i] = Integer.parseInt(split[1]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter dice rolls:");
		prompt();
		split();
	}

}