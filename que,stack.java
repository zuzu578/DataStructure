package newnew1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class new01 {

	public static void main(String[] args) {
		//stack 자료구조
		Stack<String> stack = new Stack<>();
		//stack.push("first");
		//stack.push("second");
		//stack.push("third");
		//que 자료구조
		 Queue<String> queData = new ArrayDeque<String>();
		 queData.add("first");
		 queData.add("second");
		 queData.add("third");
		 System.out.println(queData.peek());
	}
}


