package ch4;
//4-7
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;
        int num = 0;
        int sum = 0;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            num = scanner.nextInt();
            if (num == 1){
                System.out.print("예금액>");
                balance = scanner.nextInt();
                sum += balance;
            }else if (num == 2){
                System.out.print("출금액>");
                balance = scanner.nextInt();
                sum -= balance;
            }else if(num == 3){
                System.out.print("잔고>");
                System.out.println(sum);
            }else if(num == 4){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
