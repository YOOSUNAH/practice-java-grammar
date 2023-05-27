package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args)  {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요.");
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.text");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");;
//        }

        FileWriter writer = new FileWriter("test.text");
        throw new IOException("파일 쓰기에 실패했어요!!");

    }
}


// try catch 를 통해서 자체적으로 해결할 수 있지만, 여기서 처리하지 않고
//이 메소드를 호출한 쪽으로 예외처리를 미루려면 throw를 이용할 수있다.