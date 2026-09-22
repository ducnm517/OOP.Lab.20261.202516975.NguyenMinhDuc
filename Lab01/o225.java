package Lab01;
import java.util.Scanner;

public class o225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1 : ");
        int n1 = scanner.nextInt();
        System.out.print("Operator : ");
        String name = scanner.nextLine(); 
        int n2 = 0;
        if (name == "/") {
            while (n2 == 0) {
                System.out.print("Number 2 : ");
                n2 = scanner.nextInt();
            }
        } else {
            System.out.print("Number 2 : ");
            n2 = scanner.nextInt();
        }
        

        switch (name) {
            case "+":
                System.out.print(n1+n2);
                break;
            case "-":
                System.out.print(n1-n2);
                break;
            case "/":
                System.out.print(n1/n2);
                break;
            case "*":
                System.out.print(n1*n2);
                break;
            default:
                break;
        }
        
        scanner.close();
    }
}