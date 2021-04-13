package ss11_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();

//        String[] strings = "s * (s – a) * (s – b * (s – c)".split("");
//        String[] strings = "s * (s – a) * s – b) * (s – c) ".split("");
        String[] strings = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))".split("");
        for (String string : strings) {
            if (string.equals("(")) {
                bStack.add(string);
            }

            if (string.equals(")")) {
                if (bStack.empty()) {
                    System.out.println("false");
                    return;
                }
                bStack.pop();
            }
        }
        if (bStack.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
