package array;

public class ArrayDi1 {

    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i][0] + " ");
            System.out.print(arr[i][1] + " ");
            System.out.print(arr[i][2] + " ");
            System.out.println();
        }
    }
}
