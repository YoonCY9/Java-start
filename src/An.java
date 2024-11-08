public class An {

    public static void main(String[] args) {

        int i = 10;
        boolean a = true;

        int charge = i * 4000;

        if (charge >= 30000){
           charge = 30000;
        }
        if (a) {
            charge= charge / 2;
        }
        System.out.println("주차 요금은 : " + charge + "원 입니다.");
    }
}
