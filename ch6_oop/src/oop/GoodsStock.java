package oop;

public class GoodsStock {
    // 속성 : code(상품코드 - p1013), stockNum(재고수량 -50)
    String code;
    int stockNum;

    // 생성자

    // 괄호 안에 아무것도 없으면 defalut 생성자 - 선택사항
    // public GoodsStock() {
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    // 기능 : 재고 추가한다, 재고 감소
    void subtrackStock(int num) {
        this.stockNum -= num;
    }

    void addStock(int num) {
        this.stockNum += num;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
