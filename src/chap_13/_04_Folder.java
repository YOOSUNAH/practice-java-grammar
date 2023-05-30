package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());

        }
        folderName = "A/B/C";
        folder = new File(folderName);
        // folder.mkdir(); 단일 폴더, 폴더를 만들려는 위치에 부모폴더가 존재하는 경우
        folder.mkdirs(); // 여러개의 하위 폴더로 구성되는 경우
        if(folder.exists()){
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        } else{
            System.out.println("폴더 생성 실패 (mkdirR)");



        }
    }
}
