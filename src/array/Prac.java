package array;

public class Prac {

    public static void main(String[] args) {
        int[][]num = new int[10][10];

        int i = 1;
        for (int row = 0; row < num.length; row++) {
            for (int column = 0; column < num[row].length; column++) {
                num[row][column] = i++;
            }
        }
        for (int row = 0; row < num.length; row++) {
            for (int column = 0; column < num[row].length; column++) {
                System.out.print(num[row][column] + " ");
            }
            System.out.println();
        }

    }
}
