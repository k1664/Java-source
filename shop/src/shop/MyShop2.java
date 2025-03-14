package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {

    Scanner sc = new Scanner(System.in);
    private String title;
    // 고객 5명 저장 가능한 배열 생성
    private User[] users = new User[5];
    // 제품 10 개 저장 가능한 배열 생성
    Product[] product = new Product[10];
    // cart (제품 저장 가능한 배열)
    Product[] cart = new Product[10];

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2명의 User 생성 후 배열객체에 담기
        users[0] = new User("Kim", PayType.CARD);
        users[1] = new User("Park", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // 5 개 제품 생성 후 배열객체 담기(tv 2개, cellphone 3개)
        product[0] = new Tv("Samsung", 500000, "2K");
        product[1] = new Tv("LG", 550000, "4K");

        product[2] = new CellPhone("S25", 1000000, "SKT");
        product[3] = new CellPhone("아이폰", 1200000, "LG U+");
        product[4] = new CellPhone("A3", 700000, "KT");
    }

    @Override
    public void start() {
        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("==============================");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s (%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[x] 종료");
        System.out.println("==============================");
        System.out.print("선택 : "); // 0 or 1 or x
        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);
            case "0":
                productList(0);
            case "1":
                productList(1);
                break;
            default:
                System.out.println("입력을 확인해주세요");
                start();
                break;
        }
        // if (input.equals("X") || input.equals("x")) {
        // System.exit(0);
        // }
        // if (Integer.parseInt(input) == users.length) {
        // productList();
        // } else {
        // System.out.println("다시 선택하세요.");
        // start();
        // } 내가 했던거
    }

    public void productList(int userNum) {
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("==============================");
        int i = 0;
        for (Product product : product) {
            if (product != null) {
                System.out.printf("[%d]\t", i++);
                product.printDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("==============================");
        System.out.print("선택 : ");

        // 0 ~ 4 or h or c
        String input = sc.nextLine();
        switch (input) {
            case "h":
            case "H":
                start();
                break;
            case "c":
            case "C":
                checkout(userNum);
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                for (int j = 0; j < cart.length; j++) {
                    // cart 빈 곳 찾기
                    if (cart[j] == null) {
                        cart[j] = product[Integer.parseInt(input)];
                        break;
                    }
                }

                productList(userNum);
                break;
            default:
                System.out.println("다시 입력해주세요");
                productList(userNum);
                break;
        }
    }

    public void checkout(int userNum) {
        System.out.println(title + " : " + users[userNum].getName() + " 체크아웃");
        System.out.println("==============================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s [%d]\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제 방법 : " + users[userNum].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("==============================");
        System.out.println("[p] 이전"); // productList()
        System.out.println("[q] 종료"); // System.exit(0)
        System.out.print("선택 : ");
        String input = sc.nextLine();
        switch (input) {
            case "p":
            case "P":
                productList(userNum);
                break;
            case "q":
            case "Q":
                System.exit(0);
            default:
                break;
        }
    }
}
