package Game.Abstract;

import Game.Entities.Member;


public class BaseMemberService implements MemberService{
    public BaseMemberService(MernisServiceAdapter mernisServiceAdapter) {

    }

    @Override
    public void save(Member member) {
        System.out.println("Üye Girişi yapıldı : " + member.getFirstName());
    }

    @Override
    public void update(Member member) {
        System.out.println("Üye Güncellendi : " + member.getFirstName());
    }

    @Override
    public void delete(Member member) {
        System.out.println("Üye Silindi : " + member.getFirstName());

    }
}
