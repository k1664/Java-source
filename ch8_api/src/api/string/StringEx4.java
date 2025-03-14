package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        // String result = obj.findKim(names);
        String result = obj.findName(names);
        System.out.println(result);
    }

    public String findKim(String[] seoul) {
        // 반환 : "Kim 은 3 번째에 있다."
        int i = 0;
        for (; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }
        return "Kim 은 " + i + 1 + "번째에 있다.";
    }

    public String findName(String[] seoul) {
        List name = new ArrayList<>(Arrays.asList(seoul));
        int i = name.indexOf("Kim");

        return "Kim 은 " + i + 1 + "번째에 있다.";
    }
}
