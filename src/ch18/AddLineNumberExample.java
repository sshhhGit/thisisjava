package ch18;
//18-7
import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception{
        //정확환 경로로 수정하세요.
        String filePath =
                "C:\\Users\\TJ\\IdeaProjects\\thisisjava\\src\\ch18\\BufferedReaderExample.java";
        //작성위치

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String data;
        int i = 0;
        while ((data = br.readLine()) != null){
            System.out.println(++i+": "+data);
        }
        br.close();
    }
}
