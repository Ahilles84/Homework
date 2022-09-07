package task_2;
public class HappyTicket {
	public static int happyTicketsCounter (int number) {
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
		return happyCounter;
	}
	public static void main (String[] args) {
		System.out.println(happyTicketsCounter(999999));
	}
}