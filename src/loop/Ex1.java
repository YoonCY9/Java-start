package loop;

public class Ex1 {

    public static void main(String[] args) {
        int count = 1;

        while (count <= 10){
            System.out.println(count);
            count++;
        }
        System.out.println("----------------");

        for (int count2 = 1; count2 <= 10; count2++) {
            System.out.println(count2);
        }
    }
}
