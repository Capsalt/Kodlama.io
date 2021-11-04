package Game.Concrete;


import Game.Abstract.MemberCheckService;
import Game.Entities.Member;

public class MemberCheckManager implements MemberCheckService {

    @Override
    public boolean checkIfRealPerson(Member member) {
        return true;
    }
}
