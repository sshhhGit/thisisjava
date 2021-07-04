package ch11;
//11-8
import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";

        //방법1 (split() 메소드 이용)
        String[] result1 = str.split(",");
        for (int i=0;i< result1.length;i++){
            System.out.println(result1[i]);
        }

        System.out.println();

        //방법2 (StringTokenizer 이용)
        StringTokenizer result2 = new StringTokenizer(str, ",");
        int count = result2.countTokens();
        for (int j=0;j<count;j++){
            String token = result2.nextToken();
            System.out.println(token);
        }
    }
}
