package lesson3;

import java.util.Scanner;
import java.util.Stack;

//последний зашёл - первый вышел (LIFO)last input first output;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type something: ");
        String source = scanner.nextLine();
        System.out.println("Source string: " + source);

        Stack<Character> chars = new Stack<>();
        for (int i = 0; i<source.length(); i++){
            chars.push(source.charAt(i));//наполнение стека
        }
        String reverse = new String();
        while(!chars.isEmpty())reverse+=chars.pop();//вывод стека в обратном порядке
        System.out.println("Reversed string: " + reverse);
    }
}
