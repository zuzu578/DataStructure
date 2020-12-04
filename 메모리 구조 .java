import java.util.ArrayList;
import java.util.Scanner;

public class testfor {
	public static void main(String[] args) {
		
		//stack의 개념//
		int a =5;
		a = 4;
		a = 3;
		a = 2; 
		a = 1;
		System.out.println(a);
		C c1 = new C();
		D d1 = new D(20,30);
		System.out.println(d1.add(20, 30));
		System.out.println(c1.running(10));
		Ignite str1 = new Ignite();
		Ignite str2 = new Ignite();
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.out.println("같은 메모리 주소이다.");
		}else {
			System.out.println("다른 메모리 주소이다.");
		}
		//인스턴스의 내용이 같아도 참조변수(레퍼런스가 다르면) 다르다.//
		//1)힙==>객체(인스턴스)가 힙에 저장이됨(알맹이가(내용이) 힙에 저장이된다.),
		//2)스택 ==>객체의 참조값(레퍼런스,주소,해시코드)가 스택에 저장//
}
	
}
class D{
	int k;
	int q;
	public D(int i, int j){
		this.k = i;
		this.q = j;
		
	}
	protected int add(int x, int y) {
		int p = this.k+x;
		int r = this.q+y;
		
		return p+r;
		
	}
	
	
}
class Ignite{
	Ignite(){
		
	}
	
}
class C{
	
	protected int running(int x) {
		if(x==1) {
			return x;
		}else {
			return x+running(x-1);
		}
		
	}
}


	




