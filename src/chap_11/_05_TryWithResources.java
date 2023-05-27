package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--------------------");

        //try(객체 선언){} cath(){}  _close 메소드를 자동으로 호출함.
        // 조건 : 이 객체는 AutoCloseable 인터페이스를 구현을 해줘야함.그래야 close가 자동으로 호출됨
        try(MyFileWriter writer2 = new MyFileWriter()){
            writer2.write("빵이 먹고 싶어요.");
        }catch(Exception e){
            e.printStackTrace();
        }

        BufferedWriter bw = null;
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 받습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}
