package Lab01;

import java.util.Scanner;

public class o64 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String[] set = {
            "January","Jan.","Jan","1",
            "February","Feb.","Feb","2",
            "March","Mar.","Mar","3",
            "April","Apr.","Apr","4",
            "May","May.","May","5",
            "June","Jun.","Jun","6",
            "July","Jul.","Jul","7",
            "August","Aug.","Aug","8",
            "September","Sep.","Sep","9",
            "October","Oct.","Oct","10",
            "November","Nov.","Nov","11",
            "December","Dec.","Dec","12"
        };

        int[] map = {
            31,31,31,31,
            28,28,28,28,
            31,31,31,31,
            30,30,30,30,
            31,31,31,31,
            30,30,30,30,
            31,31,31,31,
            31,31,31,31,
            30,30,30,30,
            31,31,31,31,
            30,30,30,30,
            31,31,31,31
        };

        while (!valid) {
            System.out.println("Enter Month");
            String mo = scanner.nextLine();
            System.out.println("Enter Year");
            int ye = scanner.nextInt();

            for (int i = 0; i < 4*12; i++) {
                if (mo == set[i] && ye >= 0) {
                    if (ye % 4 == 0) {
                        if (ye % 100 == 0 && ye % 400 !=0) continue;
                        System.out.println(29);
                        valid = true;
                        break;
                    } else {
                        System.err.println(map[i]);
                        valid = true;
                        break;
                    }
                }
            }
        }
        scanner.close();
    }
}
