package loop;

public class Ex2 {

    public static void main(String[] args) {

        int num = 2;
        while (num <= 20){
            System.out.println(num);
            num+=2;
        }
        System.out.println("-------------");

        for (int num1 = 2; num1 <= 20;num1+=2){
            System.out.println(num1);
        }
    }
}
