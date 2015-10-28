import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	private static Scanner aa;
	public static void main(String[] args) {
		HelloUser userName = new HelloUser();
		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.print("Please enter your name: ");
		aa = new Scanner(System.in);
		String s = aa.nextLine();
		userName.greetUser(s);
		return;
	}

}
