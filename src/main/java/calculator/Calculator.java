package calculator;
import java.util.Scanner; 

public class Calculator {

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a,b,choice=1;	
	while(choice!=5){
		System.out.println("Enter your choice: ");
		System.out.println("Add : 1");
		System.out.println("Exit : 5");
		choice=sc.nextInt();
		if(choice==5)
			break;

		System.out.println("Enter two numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Result " + add(a,b));
		
	}

	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	
}
