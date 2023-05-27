package chap_12;
// 상품 A, 상품 B 각각 5개씩 각각 준비
// 모두 준비된 이후 세트 상품 포장 시작
// 포장이 필요한 상품은 5개

// A 상품 준비 1/5
// B 상품 준비 1/5
// ...
// -- B 상품 준비 완료 --
// -- A 상품 준비 완료 --
// == 세트 상품 포장 시작 ==
// 세트 상품 포장 1/5
// ...
// == 세트 상품 포장 완료 ==

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++){
                System.out.println("A 상품 준비 " +  i + "/5");
            };
            System.out.println("-- A 상품 준비 완료 --");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++){
                System.out.println("B 상품 준비 " +  i + "/5");
            };
            System.out.println("-- B 상품 준비 완료 --");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        // (방법1) 두개의 상품이 포장되길 기다리는 걸 join으로 하거나
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // (방법2) threadA가 살아있거나 B가 살아있는 동안 아무것도 하지 않고 계속 기다리게 한다
//       while(threadA.isAlive() || threadB.isAlive()){
//
//       }




        Runnable runnableSet = () -> {
            System.out.println(" == 세트 상품 포장 시작 == ");
            for (int i = 1; i <= 5; i++){
                System.out.println("세트 상품 포장 " +  i + "/5");
            };
            System.out.println("== 세트 상품 포장 완료 ==");
        };
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();

    }
}