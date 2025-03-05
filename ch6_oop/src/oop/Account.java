package oop;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    // 110-10 -0100
    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다.(잔액 = 잔액 - 출금액)
    // deposit, withdraw

    // 생성자 (default, 멤버변수 3개 초기화)
    // toString

    long balance;
    String ano;
    String owner;

    void deposit(long amount) {
        this.balance += amount;
    }

    void widthraw(long amount) {
        this.balance -= amount;
    }

    public Account() {
    }

    public Account(String ano, long balance, String owner) {
        this.ano = ano;
        this.balance = balance;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", balance=" + balance + ", owner=" + owner + "]";
    }

}
