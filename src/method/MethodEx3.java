package method;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance,1000);
        balance = withdraw(balance , 2000);
        balance = withdraw(balance, 5000);
        balance = withdraw(balance, 5000);
        System.out.println("최종잔액: " + balance + "원");
    }
    public static int deposit(int a, int b){
        a = a + b;
        System.out.println(b + "원을 입금하였습니다. 현재 잔액: " + a + "원");
        return a;
    }
    public static int withdraw(int a, int b){
        if (a >= b){
            a = a - b;
            System.out.println(b + "원을 출금하였습니다. 현재 잔액: " + a + "원");
        }else {
            System.out.println(b + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return a;
    }
}
