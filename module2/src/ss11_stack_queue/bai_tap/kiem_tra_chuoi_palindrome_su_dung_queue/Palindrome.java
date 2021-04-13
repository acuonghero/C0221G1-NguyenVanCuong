package ss11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        String[] string = "abcdcbaa".split("");
        for (int i = 0; i <string.length ; i++) {
            stack.add(string[i]);
            queue.add(string[i]);
        }
        for (int i = 0; i < string.length ; i++) {
            if(!stack.pop().equals(queue.remove())){
                System.out.println("khong phai la chuoi doi xung");
                return;
            }
        }
        System.out.println("la chuoi doi xung");
    }
}
