package cond;

public class condOp1 {

    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18){
            status = "성인";
        } else {
            status = "마성년자";
        }
        System.out.println(status);
    }
}
