package chap_08.dector;

public interface Detectable {
    //메소드를 선언까지만 함
    void detect();  // 감지
    // interface 내에서 만들어지는 모든 메소드는 자동으로 앞에 public abstract가 들어간다.

     String name = "감지자";
    // interface 내에서 어떤 변수를 정의하면, 앞에 public abstract final 이 붙는다고 보면 됨
}

// Detectable 이라는 인터페이스를 만들고, 이를 구현하는 두개의 클래스를 만듬
