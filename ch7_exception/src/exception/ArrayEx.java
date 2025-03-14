package exception;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = new int[2];

        // ArrayIndexOutOfBoundsException
        try {
            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
            int num = 100 / 0; // ArithmeticException
        } catch (Exception e) {
            System.out.println("오류 발생");
        }

        try {
            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException
            int num = 100 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("오류 발생");
        }

    }
}
