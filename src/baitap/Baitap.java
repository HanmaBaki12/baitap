
package baitap;

import java.util.Scanner;1


public class Baitap {

    
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Tong hai so nguyen la " + (x + y));
        System.out.println("Hieu hai so nguyen la " + (x - y));
        System.out.println("Tich hai so nguyen la " + (x * y));
        System.out.println("Thuong hai so nguyen la " + (x / y));
        System.out.println("Phan du hai so nguyen la " + (x  %y));
    }
    
}
