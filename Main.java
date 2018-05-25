import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번쨰 수를 입력하세요");
        int a = sc.nextInt();

        System.out.println("+,-,*,/,%를 입력하세요");
        String mark = sc.next();

        System.out.println("두번째 수를 입력하세요");
        int b = sc.nextInt();

        if (mark.equals("+")){
            int result = a+b;
            System.out.println(result);
        }

        if (mark.equals("-")){
            int result = a-b;
            System.out.println(result);
        }

        if (mark.equals("*")){
            int result = a*b;
            System.out.println(result);
        }
        if (mark.equals("/")){
            int result = a/b;
            System.out.println(result);
        }
        if (mark.equals("%")){
            int result = a%b;
            System.out.println(result);
        }
    }
}
