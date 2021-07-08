package ch5;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);

        while (run){
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택>");

            int selectNo = scanner.nextInt();

            if(selectNo == 1){
                System.out.print("학생>");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
                }else if (selectNo == 2){
                for (int i=0;i<studentNum;i++){
                    System.out.print("점수입력>");
                    scores[i] = scanner.nextInt();
                }
                }else if (selectNo == 3){
                System.out.println("점수리스트>");
                    for (int j=0;j< scores.length;j++){
                        System.out.println(scores[j]);
                    }
                }else if (selectNo == 4){
                System.out.println("분석>");
                    for (int k=0;k<scores.length;k++){
                        sum += scores[k];
                    }
                    cnt += scores.length;
                    avg = sum/cnt;
                    System.out.println("합계 : " + sum);
                    System.out.println("평균 : " + avg);
                } else if(selectNo == 5){
                    run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
