package cond;

public class If4 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount += 1000;
            System.out.println(price + "원 이상 구매 " + discount + "원 할인");
        }
        if(age <= 10) {
            discount += 1000;
            System.out.println(age + "세 이하 " + discount + "원 할인");
        }
        System.out.println("총 할인 금액 :  " + discount + "원 입니다.");
    }
}
