package loop;

public class While2_1 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int endNum = 10;

        while (i <= endNum){
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
