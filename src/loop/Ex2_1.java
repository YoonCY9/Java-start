package loop;

public class Ex2_1 {

    public static void main(String[] args) {

        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
        System.out.println("-----------------");


        for (int num2 = 2, count2 = 1; count2 <= 10;num2 += 2, count2++){
            System.out.println(num2);
        }
    }
}
