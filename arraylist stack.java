import java.util.ArrayList;
import java.util.Scanner;

public class testfor {


	public static void main(String[] args) {
		//stack 구현//
		S s1 = new S();
		//stack 연산//
		s1.push("A");
		s1.push("B");
		s1.push("C");
		//pop연산//
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
		
}
	
}
class S{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.remove(len-1));
	}
}


	




