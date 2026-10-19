import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Simple Addition Program ---");
        
        // Read the first number
        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();
        
        // Read the second number
        System.out.print("Enter your second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the sum
        int sum = num1 + num2;
        
        // Display the output
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
