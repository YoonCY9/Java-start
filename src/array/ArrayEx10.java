package array;

import java.util.Scanner;

public class ArrayEx10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        int count = 0;
        String[] name = new String[maxProducts];
        int[] price = new int[maxProducts];

        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                if(count >= maxProducts){
                    System.out.println("더 이상 상품을 등록할수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                name[count] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                price[count] = scanner.nextInt();

                count++;
            }
            else if (menu == 2){
                if(count == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < count; i++) {
                    System.out.println(name[i] + ":" + price[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("오류");
            }
        }



    }
}
