package Lab01;
import java.util.Scanner;

public class o226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mode (linear, system, quadratic) : ");
        String name = scanner.next();

        switch (name) {
            case "linear":
                System.out.print("A : ");
                float a = scanner.nextFloat();
                System.out.print("B : ");
                float b = scanner.nextFloat();
                
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Infinite solutions");
                    } else {
                        System.out.println("No solution");
                    }
                } else {
                    System.out.println("Solution : x = " + (-b / a));
                }
                break;
                
            case "system":
                System.out.print("A11 : ");
                float a11 = scanner.nextFloat();
                System.out.print("A12 : ");
                float a12 = scanner.nextFloat();
                System.out.print("B1 : ");
                float b1 = scanner.nextFloat();
                System.out.print("A21 : ");
                float a21 = scanner.nextFloat();
                System.out.print("A22 : ");
                float a22 = scanner.nextFloat();
                System.out.print("B2 : ");
                float b2 = scanner.nextFloat();

                float det = a11 * a22 - a21 * a12;
                
                float detx = (b1 * a22) - (b2 * a12); 
                float dety = (a11 * b2) - (a21 * b1); 
                
                if (det == 0) {
                    if (detx == 0 && dety == 0) {
                        System.out.println("Infinite solutions");
                    } else {
                        System.out.println("No solution");
                    }
                } else {
                    System.out.println("Solution : x = " + (detx / det) + ", y = " + (dety / det));
                }
                break;
                
            case "quadratic":
                System.out.print("A : ");
                float aq = scanner.nextFloat();
                System.out.print("B : ");
                float bq = scanner.nextFloat();
                System.out.print("C : ");
                float cq = scanner.nextFloat();

                if (aq == 0) {
                    if (bq == 0) {
                        if (cq == 0) {
                            System.out.println("Infinite solutions");
                        } else {
                            System.out.println("No solution");
                        }
                    } else {
                        System.out.println("Solution : x = " + (-cq / bq));
                    }
                } else { 
                    float d = bq * bq - 4 * aq * cq;
                    if (d < 0) {
                        System.out.println("No real solution");
                    } else if (d == 0) {
                        System.out.println("Dual root : x = " + (-bq / (2 * aq)));
                    } else {
                        System.out.println("Solution : x1 = " + ((-bq - Math.sqrt(d)) / (2 * aq)) + ", x2 = " + ((-bq + Math.sqrt(d)) / (2 * aq)));
                    }
                }
                break;
        
            default:
                System.out.println("Invalid mode entered.");
                break;
        }
        
        scanner.close();
    }
}