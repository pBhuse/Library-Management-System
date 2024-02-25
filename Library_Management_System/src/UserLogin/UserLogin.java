package UserLogin;
import admin.Admin;
public class UserLogin {

	public int userId;
	public String Password;

public void  check(int userId,String Password)
{
	if(userId==123 && Password.equalsIgnoreCase("pratiksha@12"))
	{
		System.out.println("Login successful : Welcome Admin");
		System.out.println();
	      Admin obj=new Admin();
          obj.adminInput();
		
	}
	else 
	{
		System.out.println("You have Entered Incorrect Id or Password ");
	    System.out.println("Login Unsuccessful.....");
	}

}
public void SignUp(int userId,String Password)
{
if(userId==123 && Password.equalsIgnoreCase("pratiksha@12"))
	{
		System.out.println("Registration successful!");
	}
	
}
	
}







//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class UserAuthentication {
//    private Map<String, String> usersData;
//
//    public UserAuthentication() {
//        this.usersData = new HashMap<>();
//    }
//
//    public boolean signUp(String username, String password) {
//        if (usersData.containsKey(username)) {
//            System.out.println("User already exists. Please choose a different username.");
//            return false;
//        } else {
//            usersData.put(username, password);
//            System.out.println("Registration successful!");
//            return true;
//        }
//    }
//
//    public boolean login(String username, String password) {
//        if (usersData.containsKey(username) && usersData.get(username).equals(password)) {
//            System.out.println("Login successful!");
//            return true;
//        } else {
//            System.out.println("Incorrect username or password. Please try again.");
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        UserAuthentication authSystem = new UserAuthentication();
//        Scanner scanner = new Scanner(System.in);
//
//        // Sign up
//        System.out.print("Enter your username: ");
//        String signUpUsername = scanner.nextLine();
//        System.out.print("Enter your password: ");
//        String signUpPassword = scanner.nextLine();
//        authSystem.signUp(signUpUsername, signUpPassword);
//
//        // Login
//        System.out.print("Enter your username: ");
//        String loginUsername = scanner.nextLine();
//        System.out.print("Enter your password: ");
//        String loginPassword = scanner.nextLine();
//        authSystem.login(loginUsername, loginPassword);
//
//        // Close the scanner
//        scanner.close();
//    }
//}

