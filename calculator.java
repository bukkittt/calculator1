import java.util.Scanner;
public class calculator
{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
    System.out.println("This is a basic calculator! Choose operation below:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("Choose 1 through 4");
    int operator = input.nextInt();
    
    
     if (operator == 1) {
        System.out.println("Choose two numbers:");
        double x = input.nextDouble();
        double y = input.nextDouble();   
        double sum = x + y;
            System.out.println(sum); 
        } else if (operator == 2) {
        System.out.println("Choose two numbers:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double difference = x - y;
        System.out.println(difference);
        } else if (operator == 3) {
        System.out.println("Choose two numbers:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double product = x * y;
        System.out.println(product);
        } else if (operator == 4) {
        System.out.println("Choose two numbers:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double quotient = x / y;
        System.out.println(quotient);
        } else if (operator == 69) {
          System.out.println("Congrats! You found the easter egg!");  
        } else {
            System.out.println("Operator Number Invalid!");
            System.exit(0);
        }
    }
}