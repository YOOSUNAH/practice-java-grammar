package chap_08.dector;

public class AccidentDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}


