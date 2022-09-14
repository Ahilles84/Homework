package task_2;

import java.util.Scanner;

public class HappyTicket {
	public static void main (String[] args) {
		System.out.println("Enter a number from 1001 to 999999");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int happyCounter = 0;
		while (number > 0) {
			int tailSum = 0;
			int headSum = 0;
			int tempNum = number;
			for (int i = 0; i < 3; i++) {
				tailSum = tailSum + tempNum % 10;
				tempNum = tempNum / 10;
			}
			for (int j = 0; j < 3; j++) {
				headSum = headSum + tempNum % 10;
				tempNum = tempNum / 10;
			}
			if (headSum == tailSum) {
				happyCounter++;
			}
			number--;
		}
		System.out.println("We'll need " + happyCounter + " souvenirs!");
	}
}
