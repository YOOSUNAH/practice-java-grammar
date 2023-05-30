package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = "/Users/yuseon-a/IdeaProjects/practice-java-grammar/src/chap_13"; // .은 현재 위치 경로를 말함
        String folder = "src/chap_13";  // 13package 밑에 있는 파일 폴더 조회
        // String folder = ".";  .은 현재 위치 경로를 말함
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {
           if (file.isFile()){
               System.out.println("(파일)" + file.getName());
           } else if (file.isDirectory()) {
               System.out.println("(폴더)" + file.getName());
           }
        }

    }
}
