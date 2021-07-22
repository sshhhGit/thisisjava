package ch18;

import java.io.FileInputStream;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception{
        //정확환 경로로 수정하세요.
        String filePath =
                "C:\\Users\\TJ\\IdeaProjects\\thisisjava\\src\\ch18\\BufferedReaderExample.java";
        //작성위치

        FileInputStream fis = new FileInputStream(filePath);

        int readByteNo;
        int i = 2;
        System.out.print("1: ");
        while ((readByteNo = fis.read()) != -1){
            System.out.write(readByteNo);
            if (readByteNo == 10){
                System.out.print(i+": ");
                i++;
            }
        }
        fis.close();
    }
}
