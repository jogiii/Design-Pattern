/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        System.out.println("Hello " + first + " and " + second);
        System.out.println("Goodbye " + second + " and " + first);

    }
}
