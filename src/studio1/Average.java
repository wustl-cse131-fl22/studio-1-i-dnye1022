package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First Integer?");
		int firstInt = in.nextInt();
		System.out.println("Second Integer?");
		int secondInt = in.nextInt();
		double average = (firstInt + secondInt) / 2.0;
		System.out.println(average);
	}

}
