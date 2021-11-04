package Game.Abstract;

import Game.Entities.Member;
import mernisServicesReferences.VMBKPSPublicSoap;


public class MernisServiceAdapter implements MemberCheckService {

    @Override
    public boolean checkIfRealPerson(Member member) throws Exception {

        VMBKPSPublicSoap client = new VMBKPSPublicSoap();
        return client.TCKimlikNoDogrula(member.getTcNo(), member.getFirstName(),
                member.getLastName(), member.getYearOfBirth());
    }
}
