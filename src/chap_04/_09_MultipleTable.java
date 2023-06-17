package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4
        // 2 * 3 = 6
        // 2 * 4 = 8

        // 2 8 9 = 18

        // 3 ....

        // 9 ...

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 1 = 2
            }
            System.out.println();

//            int j = 1;
//            System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 1 = 2
//            j ++;
//            System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 2 = 4
//            j ++;
//            System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 3 = 6
//            j ++;
        }
    }
}
