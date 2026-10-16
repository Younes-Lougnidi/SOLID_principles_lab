package Problem3.problem3after;

import java.util.List;

public class Bank {
    public static void chargeMonthlyFee(List<WithdrawableAccount> accounts) {
        for(WithdrawableAccount acc : accounts){
            acc.withdraw(10);
        }
    }
}

