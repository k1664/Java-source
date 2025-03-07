package extend;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    private long balance;
    private String ano;
    private String owner;

    void deposit(long amount) {
        this.balance += amount;
    }

    void widthraw(long amount) throws Exception {
        if (amount > balance)
            throw new Exception("잔액확인");
        this.balance -= amount;
    }

    // public Account() {
    // }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.balance = balance;
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", balance=" + balance + ", owner=" + owner + "]";
    }

}
