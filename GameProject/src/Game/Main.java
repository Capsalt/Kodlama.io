package Game;

import Game.Abstract.BaseMemberService;
import Game.Abstract.MernisServiceAdapter;
import Game.Entities.Member;

public class Main {
    public static void main(String[] args) {

        BaseMemberService memberManager = new BaseMemberService(new MernisServiceAdapter());
        Member mb1 = new Member(1,"Ali", "Veli", 2000,"12345612345");
        System.out.println(mb1.toString());

    }
}
