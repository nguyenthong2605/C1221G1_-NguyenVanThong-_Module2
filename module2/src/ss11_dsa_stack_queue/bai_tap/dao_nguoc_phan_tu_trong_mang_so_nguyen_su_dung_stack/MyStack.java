package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class MyStack<T> {
    public static void main(String[] args) {
        System.out.println("Đảo ngược phần tử trong mảng số nguyên sử dụng Stack.");
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        Stack<Integer> stack1 = new Stack<>();
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1);

        System.out.println("Đảo ngược chuỗi sử dụng Stack");
        String string = "Nguyễn Văn Thông học lớp C1221G1";
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack2.push(string.charAt(i));
        }
        System.out.println(stack2);
        String output = "";
        while (!stack2.isEmpty()) {
            output += stack2.pop();
        }
        System.out.println(output);


    }
}
