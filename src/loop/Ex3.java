package loop;

public class Ex3{

    public static void main(String[] args) {

        int sum = 0;
        int i  = 1;
        int max = 100;

        while(i <= max){
            sum += i;
            i++;
        }
        System.out.println("//max = " + max);
        System.out.println(sum);

        System.out.println("--------------");

        int sum2 = 0;
        int max2 = 100;
        for (int i2 = 1;i2 <= max2;i2++){
            sum2+=i2;
        }
        System.out.println("//max = " + max);
        System.out.println(sum);
    }
}
