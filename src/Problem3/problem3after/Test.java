package Problem3.problem3after;

import Problem3.problem3before.FixedTermAccount;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        CurrentAccount myaccount = new CurrentAccount(500);
        FixedTermAccount myFixedTermAcc = new FixedTermAccount(1000);
        StudentAccount myStudentAcc = new StudentCurrentAccount(1000,200);
        List<WithdrawableAccount> myAccList = new ArrayList<WithdrawableAccount>();
        myAccList.add(myaccount);
        myAccList.add(myStudentAcc);
        Bank.chargeMonthlyFee(myAccList);
        System.out.println("Current account balance: " + myaccount.getBalance());
        System.out.println("Fixed-term account balance: " + myFixedTermAcc.getBalance());
        System.out.println("Student account balance: " + myStudentAcc.getBalance());
    }
}
