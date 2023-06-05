package chap_08.practice_solid_ocp;

public class ECommerceApplication {

    public static void main(String[] args) {

        MemberRepository memberRepository = new MySQLMemberRepositoryImpl();
        MemberRepository memberRepository2 = new MongoDBMemberRepositoryImpl();


        MemberService memberService = new MemberService(memberRepository2);

        memberService.signUp(
                "sun-a",
                "sun-a@gmail.com",
                "sun-a123yi!!"
        );

    }
}
