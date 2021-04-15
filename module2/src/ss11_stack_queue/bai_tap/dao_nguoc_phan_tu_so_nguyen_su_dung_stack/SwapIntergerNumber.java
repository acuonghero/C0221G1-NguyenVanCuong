package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_so_nguyen_su_dung_stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SwapIntergerNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arrayNumber = new int[5];
        arrayNumber[0] = 3;
        arrayNumber[1] = 5;
        arrayNumber[2] = 2;
        arrayNumber[3] = 1;
        arrayNumber[4] = 6;

        for(Integer integer : arrayNumber){
            stack.push(integer);
        }
        for (int i = 0 ; i <arrayNumber.length; i++){
            arrayNumber[i]=stack.pop();
        }
        for(int integer : arrayNumber){
            System.out.println(integer);
        }
    }
}
