package ch14;
//14-6

import java.util.function.ToIntFunction;

public class LambdaExample3 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 90, 96),
    };

    //avg() 메소드 작성
    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for (Student student : students){
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
        //람다식
        //double englishAvg = avg( s -> s.getEnglishScore() );

        //메소드 참조 14-7
        double englishAvg = avg( Student :: getEnglishScore );
        System.out.println("영어 평균 점수 : " + englishAvg);

        //람다식
        //double mathAvg = avg( s -> s.getMathScore() );

        //메소드 참조 14-7
        double mathAvg = avg( Student :: getMathScore );
        System.out.println("수학 평균 점수 : " + mathAvg);
        }

        public static class Student {

        private String name;
        private int englishScore;
        private int mathScore;

            public Student(String name, int englishScore, int mathScore) {
                this.name = name;
                this.englishScore = englishScore;
                this.mathScore = mathScore;
            }

            public String getName() {
                return name;
            }

            public int getEnglishScore() {
                return englishScore;
            }

            public int getMathScore() {
                return mathScore;
            }
    }
}
