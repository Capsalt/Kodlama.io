package Game.Concrete;

import Game.Abstract.BaseMemberService;
import Game.Abstract.MernisServiceAdapter;

public class SellManagement extends BaseMemberService {

    public SellManagement(MernisServiceAdapter mernisServiceAdapter) {
        super(mernisServiceAdapter);
    }
}
