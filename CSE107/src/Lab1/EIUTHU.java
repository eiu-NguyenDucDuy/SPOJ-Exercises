package Lab1;

import java.util.Scanner;

class EIUTH {// Letter
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String firstPart = sc.nextLine();
        String secondPart = sc.nextLine();

        var result = -1;
        for (var i = 0; i < firstPart.length(); i++) {
            String firstEnd = firstPart.substring(i);

            if (secondPart.startsWith(firstEnd)) {
                result = secondPart.length() + i;
                break;
            }
        }

        System.out.println(result == -1 ? firstPart.length() + secondPart.length() : result);
    }
}