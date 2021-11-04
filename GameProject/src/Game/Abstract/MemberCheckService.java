package Game.Abstract;

import Game.Entities.Member;

public interface MemberCheckService {
    boolean checkIfRealPerson(Member member) throws Exception;
}
