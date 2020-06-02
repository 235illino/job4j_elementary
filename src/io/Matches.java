package io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int sticks = 11;
        while (sticks > 0) {
            System.out.println("First player take 1 - 3 sticks");
            sticks = sticks - Integer.valueOf(input1.nextLine());
            System.out.println(sticks + " sticks left");
            if (sticks == 0) {
                System.out.println("Second player win");
                break;
            }
            System.out.println("Second player take 1 - 3 sticks");
            sticks = sticks - Integer.valueOf(input2.nextLine());
            if (sticks == 0) {
                System.out.println("First player win");
                break;
            }
            System.out.println(sticks + " sticks left");
        }
    }

}
