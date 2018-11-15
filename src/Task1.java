import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a: ");
		int a = scan.nextInt();
		System.out.println("Input b: ");
		int b = scan.nextInt();
		
		int c = a+b;
		int o = a-b;
		int h = a*b;
		int d = a/b;

		System.out.println("a+b = " + add(a,b));
		System.out.println("a-b = " + minus(a,b));
		System.out.println("a*b = " + mult(a,b));
		System.out.println("a/b = " + div(a,b));
		
		String name;

		System.out.println("what is your name?");
		name = scan.next();
		System.out.println("My name's " + name);
	}
	public static int add(int a, int b) {
		int result=a+b;
		return result;
	}
	public static int minus(int a, int b) {
			int result=a-b;
			return result;
	}
	public static int mult(int a, int b) {
				int result=a*b;
				return result;
	}
	public static int div(int a, int b) {
					int result=a/b;
					return result;
	}
}