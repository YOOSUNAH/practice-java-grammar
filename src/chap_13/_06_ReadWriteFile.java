package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에서 내용을 쓸 때
        // Buffered 데이터를 한곳에서 다른 곳으로 보내는 과정에서 잠시동안 데이터를 보관하는 장소

        // 파일 쓰기
        //FileWriter fw = new FileWriter("goodjob.txt");
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt",true))) {
////            bw.write("1. 이제 거의 끝이 보여요.");
////            bw.newLine(); // 줄바꿈 처리
////            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
////            bw.newLine();
//            bw.write("3. 조금만 더 힘내요!");  // 내용 추가하고 싶을때 ,true 로 apped가 될수있도록하기
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 파일 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }


    }
}
