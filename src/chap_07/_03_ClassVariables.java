package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 =new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;
        // BlackBox라는 class로 만들어진 b1, b2 와 같이 모든 객체에 적용이 됨.
        // class 로 부터 만들어진 객체에다가 공통적으로 적용해야 하는 상황이 있다면, 그 변수는 인스턴스 변수가 아니고 class 변수로 사용

        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 권장 되는 방식. "객체. "보다는 "class 이름. "으로 접근하는 방식을 권장



    }
}
