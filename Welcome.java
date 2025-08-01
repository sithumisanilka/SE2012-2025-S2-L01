import java.util.Scanner;
public class Welcome {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = obj.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = obj.nextLine();
		System.out.println("Welcome to the Second Year"+" " + firstName +" " + lastName);

		
	}
}