package algo;

import java.util.Scanner;

/**
 * Created by sould on 2016-01-27.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n"+(a%b));
    }
}
