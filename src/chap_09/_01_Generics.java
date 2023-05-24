package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 -> 제네릭스에서 제공하는 건 객체
//       int -> Integer.parseInt();  // Wrapper 클래스 를 이용해야 함.
//        double -> Double.toString();
//        float -> Float

       // int[] iArray = {1, 2, 3, 4, 5};  // 기본 자료형은 바로 제네릭스로 쓸수없음.
        Integer[] iArray = {1, 2, 3, 4, 5};  // Wrapper 클래스 를 이용해야 함.
       // double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; // 기본 자료형
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; // Wrapper 클래스 를 이용해야 함.
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }
    // T : Type, K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array){  // 제네릭스를 이용
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();  // 하나의 메소드(printAnyArray)만 가지고, 세개의 서로 다른 메소드를 대체함
        // 중복적으로 코드를 정의할 필요없이, 서로 다른 타입이지만 모두 T 하나만 가지고 처리
        // 불필요한 코드 중복을 줄일 수 있다는 장점.
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
