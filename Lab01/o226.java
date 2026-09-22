package Lab01;
import java.util.Scanner;


public class o226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mode (linear, system, quadratic) : ");
        String name = scanner.nextLine();

        switch (name) {
            case "linear":
                System.out.print("A : ");
                int a = scanner.nextInt();
                System.out.print("B : ");
                int b = scanner.nextInt();
                if (a == 0) System.out.println("No solution");
                else System.out.println("Solution" + (-b/a));
                break;
            case "system":
                System.out.print("A11 : ");
                int a11 = scanner.nextInt();
                System.out.print("A12 : ");
                int a12 = scanner.nextInt();
                System.out.print("B1 : ");
                int b1 = scanner.nextInt();
                System.out.print("A21 : ");
                int a21 = scanner.nextInt();
                System.out.print("A22 : ");
                int a22 = scanner.nextInt();
                System.out.print("B2 : ");
                int b2 = scanner.nextInt();

                int det = a11*a22 - a21*a12;
                int detx = (a22*b1) - (a21*b2);
                int dety = (a11*b2) - (a12*b1);
                System.out.println("Solution : x = " + (detx/det) + ", y = " + (dety/det));
                break;
            case "quadratic":
                System.out.print("A : ");
                int aq = scanner.nextInt();
                System.out.print("B : ");
                int bq = scanner.nextInt();
                System.out.print("C : ");
                int cq = scanner.nextInt();

                if (aq == 0 && bq != 0) {
                    System.out.println("Solution : x = " + (-cq/bq));
                } else if (aq > 0) {
                    int d = bq*bq - aq*cq*4;
                    if (d < 0) {
                        System.out.println("No real solution");
                    } else if (d == 0) {
                        System.out.println("Dual root : " + (-bq/(2*aq)));
                    } else {
                        System.out.println("Solution : x1 = " + ((-bq-Math.sqrt(d))/(2*aq)) + ", x2 = "+((-bq+Math.sqrt(d))/(2*aq)));
                    }
                } else {
                    System.out.println("No solution");
                }
                break;
        
            default:
                break;
        }
        
        scanner.close();
    }
}
