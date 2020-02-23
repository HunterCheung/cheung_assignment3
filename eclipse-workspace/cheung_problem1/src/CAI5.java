import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	static char restart;
	static int difficulty;
	static int problemtype; 
	static double first, second;
	static double answer;
	static double guess;
	static int score;
	public static void main(String[] args) {
		quiz();
		}
	public static void quiz() {
		while(restart!='n') {
		readDifficulty();
		readProblemType();
		for(int counter=1;counter<=10;counter++) {
		generateQuestionArgument();
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
		newSet();
		}
	}
	public static void newSet() {
		System.out.println("Do you want to continue?(y/n)");
		Scanner scan = new Scanner(System.in);
		restart = scan.next().charAt(0);
	}
	
	public static void readDifficulty() {
		System.out.println("Enter difficulty level (1,2,3,or 4): ");
		Scanner scan = new Scanner(System.in);
		difficulty = scan.nextInt();
	}
	
	public static void readProblemType() {
		System.out.println("Pick problem type to solve");
		System.out.println("Option 1: Addition");
		System.out.println("Option 2: Multiplication");
		System.out.println("Option 3: Subtraction");
		System.out.println("Option 4: Division");
		System.out.println("Option 5: Mixture of all");
		Scanner scan = new Scanner(System.in);
		problemtype = scan.nextInt();
	}
	
	public static void generateQuestionArgument() {
		switch(difficulty) {
		case 1: 		
			difficulty=9;
			break;
		case 2:
			difficulty=99;
			break;
		case 3:
			difficulty=999;
			break;
		case 4:
			difficulty=9999;
			break;
		}
	}
	
	public static void askQuestion() {
		if(problemtype==1) {
			SecureRandom sr = new SecureRandom();
			first = sr.nextInt(difficulty);
			second = sr.nextInt(difficulty);
			answer = first + second;
			System.out.println("How much is "+first+" plus "+second+"?");
		}
		
		else if(problemtype==2) {
			SecureRandom secure = new SecureRandom();
			first = secure.nextInt(difficulty);
			second = secure.nextInt(difficulty);
			answer = first * second;
			System.out.println("How much is "+first+" times "+second+"?");
		}
		
		else if(problemtype==3) {
			SecureRandom securerandom = new SecureRandom();
			first = securerandom.nextInt(difficulty);
			second = securerandom.nextInt(difficulty);
			answer = first - second;
			System.out.println("How much is "+first+" minus "+second+"?");
		}
		
		else if(problemtype==4) {
			SecureRandom random = new SecureRandom();
			first = random.nextInt(difficulty);
			second = random.nextInt(difficulty);
			answer = first / second;
			System.out.println("How much is "+first+" divided by "+second+"?");
		}
		
		else {
			Random randomGenerator = new Random();
			int response = randomGenerator.nextInt(4)+1;
			switch(response) {
			case 1: 
				SecureRandom sr = new SecureRandom();
				first = sr.nextInt(difficulty);
				second = sr.nextInt(difficulty);
				answer = first + second;
				System.out.println("How much is "+first+" plus "+second+"?");
				break;
			case 2:
				SecureRandom secure = new SecureRandom();
				first = secure.nextInt(difficulty);
				second = secure.nextInt(difficulty);
				answer = first * second;
				System.out.println("How much is "+first+" times "+second+"?");
				break;
			case 3:
				SecureRandom securerandom = new SecureRandom();
				first = securerandom.nextInt(difficulty);
				second = securerandom.nextInt(difficulty);
				answer = first - second;
				System.out.println("How much is "+first+" minus "+second+"?");
				break;
			case 4:
				SecureRandom random = new SecureRandom();
				first = random.nextInt(difficulty);
				second = random.nextInt(difficulty);
				answer = first / second;
				System.out.println("How much is "+first+" divided by "+second+"?");
				break;
				
			}
		}
			
	}
	
	public static void readResponse() {
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
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
