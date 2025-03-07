package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard; // 교통카드 기능의 여부

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    } // boolean 타입이라 get 말고 is로 사용

    // 교통비 지불
    long payTrafficCard(String cardNo, int amount) throws Exception {
        // 교통카드이 있다면 교통비 지불
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다.");
        }
        // 카드번호, 잔액 확인 후 지불한다.
        // long balance = pay(cardNo, amount);
        // return balance;
        return pay(cardNo, amount);
    }
}
