package sdm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        double sum = num1 + num2 + num3;
        double average = sum / 3;
        
        double largest = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("Sum of the largest number: " + largest);
        System.out.println("Average of the three numbers: " + average);
        
        scanner.close();
    }
}
