package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1,15);
		numbers.addFirst(5);
		numbers.add(1, 19);
		numbers.addFirst(4);
		numbers.remove(1);
		numbers.removeFirst();
		numbers.removeLast();
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
		System.out.println(numbers.get(4));
		System.out.println(numbers.remove(1));
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(30));
	    
		ArrayList.ListIterator li = numbers.listIterator();
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		
	}

}
