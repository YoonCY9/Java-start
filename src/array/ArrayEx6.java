package array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = scanner.nextInt();

        int[] numbers = new int[num];

        System.out.println(num + "개의 정수를 입력하세요: ");

        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < num; i++) {
            if (numbers[i] > max){
                max = numbers[i];

            }if (numbers[i] < min){
                min = numbers[i];
            }

        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);


    }
}