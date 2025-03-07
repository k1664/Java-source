package extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // new로 부르는 순간 CheckingAccount의 생성자를 호출하게 되어있다.
        // 부모의 인스턴스도 같이 생성됨
        CheckingAccount cAccount = new CheckingAccount("110-10", "hong", 10000, "123-1234");

        System.out.println("계좌번호 : " + cAccount.getAno()); // null
        System.out.println("계좌주 : " + cAccount.getOwner()); // null
        System.out.println("계좌잔액 : " + cAccount.getBalance()); // 0
        System.out.println("체크카드번호 : " + cAccount.getCardNo()); // nul

        try {
            // cardNo나 잔액을 확인해주세요
            System.out.println("현재잔액 : " + cAccount.pay("123-1234", 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount creditLineAccount = new CreditLineAccount("110-10", "hong", 10000, 3000000);
        try {
            // creditLineAccount.widthraw(35000000);
            creditLineAccount.widthraw(350000);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonusPointAccont
        BonusPointAccount bonusPoint = new BonusPointAccount("110-10", "hong", 10000, 0);
        bonusPoint.deposit(100000);
        System.out.println("현재 보너스포인트 : " + bonusPoint.getBonusPoint());

        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("110-10", "hong", 10000, "123-1234",
                false);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("110-10", "hong", 10000, "123-1234",
                true);
        try {
            System.out.println("교통 카드 지불 후 현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("123-1234", 1750));
            System.out.println("현재 잔액 : " + checkingTrafficAccount.payTrafficCard("123-1234", 1750));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
