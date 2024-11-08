package array;

public class ArrayDi0_1 {

    public static void main(String[] args) { 
        // 강의 듣기 전 나혼자 해본 것
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;


        for (int i = 0; i < arr.length; i++) {
            if(i != 0){
                System.out.println();
            }
            for (int j = 0; j < arr.length + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}
