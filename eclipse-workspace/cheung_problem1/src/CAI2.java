import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
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
		first = sr.nextInt(9);
		second = sr.nextInt(9);
		answer = first * second;
		if(answer==0)
			askQuestion();
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
		Random randomGenerator = new Random();
		int response = randomGenerator.nextInt(4)+1;
		switch(response) {
			case 1: System.out.println("Very Good!");
			        break;
			case 2:System.out.println("Excellent!"); 
			        break;
			case 3:System.out.println("Nice Work!");
			        break;
			case 4:System.out.println("Keep up the good work!");
			        break;
			}
	}
	
	public static void displayIncorrectResponse() {
		Random randomGenerator = new Random();
		int response = randomGenerator.nextInt(4)+1;
		switch(response) {
			case 1: System.out.println("No. Please try again.");
			        break;
			case 2:System.out.println("Wrong. Try once more."); 
			        break;
			case 3:System.out.println("Don't give up!");
			        break;
			case 4:System.out.println("No. Keep Trying.");
			        break;
			}
			
		}

}
