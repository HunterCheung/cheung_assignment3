import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	static int first, second;
	static int answer;
	static int guess;
	public static void main(String[] args) {
		quiz();
		}
	public static void quiz() {
		askQuestion();
		readResponse();
		int result = isAnswerCorrect();
		while(result!=1) {
			displayIncorrectResponse();
			readResponse();
			result = isAnswerCorrect();
		}
		if(result==1)
			displayCorrectResponse();
			
		
	}
	
	public static void askQuestion() {
		SecureRandom sr = new SecureRandom();
		first = sr.nextInt(9)+1;
		second = sr.nextInt(9)+1;
		answer = first * second;
		System.out.println("How much is "+first+" times "+second+"?");
	}
	
	public static void readResponse() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		guess = input; 
	}
	
	public static int isAnswerCorrect() {
		if(answer == guess)
			return 1;
		
		else
			return 0;
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very Good!");
	}
	
	public static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
		}
}
