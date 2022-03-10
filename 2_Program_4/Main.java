import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Match Format");
		System.out.println("1.ODI\n2.T20\n3.Test");
		
		int c = scanner.nextInt();
		
		System.out.println("Enter the Current Score");
		
		int cScore = scanner.nextInt();
		
		
		System.out.println("Enter the Current Over");
		
		float cOver = scanner.nextFloat();

		
		System.out.println("Enter the Target Score");
		
		int tScore = scanner.nextInt();
		
		System.out.println("Requirements:");
		
		switch(c)
		{
		case 1: ODI o1 =new ODI();
				o1.setCurrentScore(cScore);
				o1.setCurrentOver(cOver);
				o1.setTarget(tScore);
				o1.display(); 
			break;
			
		case 2: T20 tt1 = new T20();
				tt1.setCurrentScore(cScore);
				tt1.setCurrentOver(cOver);
				tt1.setTarget(tScore);
				tt1.display();
			break;
		
		case 3: Test t1 = new Test();
				t1.setCurrentScore(cScore);
				t1.setCurrentOver(cOver);
				t1.setTarget(tScore);
				t1.display();
			break;
			
		default: System.exit(0);
		}
		
		scanner.close();
	}

}