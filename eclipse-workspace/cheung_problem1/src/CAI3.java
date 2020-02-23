import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI3 {
	static int first, second;
	static int answer;
	static int guess;
	static int score;
	public static void main(String[] args) {
		quiz();
		}
	public static void quiz() {
		int counter;
		for(counter=1;counter<=10;counter++) {
		askQuestion();
		readResponse();
		double result = isAnswerCorrect();
		if(result!=1) 
			displayIncorrectResponse();
		if(result==1)
			displayCorrectResponse();
		score+=result; 
		}
		displayCompletionMessage();
		
	}
	
	public static void askQuestion() {
		SecureRandom sr = new SecureRandom();
		first = sr.nextInt(9);
		second = sr.nextInt(9);
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
	
	public static void displayCompletionMessage() {
		score=score*10;
		System.out.println("Score: "+score+"%");
		if(score<75)
			System.out.println("Please ask your teacher for extra help.");
		if(score>=75)
			System.out.println("Congratulations, you are ready to go to the next level!");
	}

}
