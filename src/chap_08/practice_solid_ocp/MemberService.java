package chap_08.practice_solid_ocp;

public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void signUp(
            String userName,
            String email,
            String password
    ){
        // 1. validate


        // 2.
        Member member = new Member(
                userName,
                email,
                password
        );
        memberRepository.save(member);
    }
}
