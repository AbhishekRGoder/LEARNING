package wel;
import java.util.Scanner;

public class Pri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the your name :");
		String name = scan.nextLine();
		System.out.println("Enter your yob");
		int yob =scan.nextInt();
		greet(name);
		int age = calculateage(yob);
		System.out.println(name+ " now you are "+age+" years old");
		
		
		
		
	}
	public static void greet(String name) {
		System.out.println("hello "+name+" How are you");
	}
	public static int calculateage(int n) {
		return 2023-n;
	}

}
