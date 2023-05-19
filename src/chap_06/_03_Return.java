package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber(){  // String 아니어도 int 나 boolean도 가능함
        String phoneNumber = "02-1234-5678";
        return phoneNumber;  // String이라고 했으니 return 뒤에도 String이 나와야 함
    }
    // 호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";  // 바로 값을 반환할수도 있음
    }

    // 호텔 액티비티
    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 액티비티 : " + getActivities()); //문자열 변수로 받아서 하지 않아도 가능.
    }
}
