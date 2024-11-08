package method;

public class methodReturn2 {

    public static void main(String[] args) {
        checkAge(20);

    }
    public static void checkAge(int age){
        if(age < 18){
            System.out.println(age + "살, 미성년자 출입 불가합니다.");
        } else  {
            System.out.println(age + "살 출입하세요.");
        }
    }
}
