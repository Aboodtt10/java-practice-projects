import java.util.Scanner;
public class GradesSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
      // Program to calculate the sum of two grades entered by the user
      
        System.out.print("Enter the first grade = ");
    int grade = input.nextInt();

        System.out.print("Enter the seconde grade = ");
    int grade2 = input.nextInt();
    
    int sum = grade + grade2;
    System.out.print(sum);

    }
    
    
}