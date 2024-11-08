package variable;

import org.w3c.dom.ls.LSOutput;

public class Quiz1 {
    public static void main(String[] args) {
        long l;
        l = 10000000000L;
        System.out.println(l);

        boolean b;
        b = true;
        System.out.println(b);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
