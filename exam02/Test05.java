// 3개의 정수 중 중앙 값 구하기

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a:"); int a = stdIn.nextInt();
        System.out.print("정수 b:"); int b = stdIn.nextInt();
        System.out.print("정수 c:"); int c = stdIn.nextInt();

        int med;
        if ( a >= b)
            if ( b >= c)
                med = b;
            else if ( a <= c)
                med = a;
            else
                med =c;
        else if (a > c)
            med = c;
        else if (b > c)
            med = c;
        else
            med = b;

        System.out.println("중앙값은"+med+"입니다.");
    }
}
