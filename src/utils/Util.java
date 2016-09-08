package utils;

import java.util.Scanner;

/**
 * @author Leboc Philippe
 */
public final class Util {

    public static final Scanner sc = new Scanner(System.in);

    public static void print(String str) {
        print(str, true);
    }

    public static void print(String str, boolean nl) {
        if(nl) System.out.println(str); else System.out.print(str);
    }

    public static int roll(int faces, int nbrOfDice) {
        int res = 0;
        for (int i = 0; i < nbrOfDice; i++) res += roll(faces);
        return res;
    }

    public static int roll(int faces) {
        return (int) ((faces-1)*Math.random()) + 1;
    }
}
