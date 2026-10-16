package Problem3.problem3before;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Account myaccount = new Account(500);
        FixedTermAccount myFixedTermAcc = new FixedTermAccount(1000);
        List<Account> myAccList = new ArrayList<Account>();
        myAccList.add(myaccount);
        myAccList.add(myFixedTermAcc);
        Bank.chargeMonthlyFee(myAccList);
    }

}
