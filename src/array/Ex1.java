package array;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / count;

        System.out.println(sum);
        System.out.println(average);
    }

}


