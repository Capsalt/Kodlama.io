package Game.Abstract;

import Game.Entities.Member;

public interface MemberService {
    void save(Member member);
    void update(Member member);
    void delete(Member member);
}
