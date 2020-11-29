package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;//몇개의 데이터가 list 에들어있는가//
	private Object[] elementData = new Object[100];//list가 수용할수있는 element 의 사이즈//
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	public boolean add(int index, Object element) {
		for(int i = size - 1 ; i >= index; i--) {
			elementData[i+1]=elementData[i];
			
		}
		elementData[index] = element;
		size++;
		return true;
	}
	public boolean addFirst(Object element) {
		
		return add(0,element);
	}
	//toString()==>객체를 문자열로 출력//
	public String toString() {
		String str = "[";
		for(int i = 0 ; i< size ;i++) {
			str = str+elementData[i];
			if(i < size-1) {
				str = str+",";
			}else {
				
			}
		}
		return str  + "]";
	}
	public Object remove(int index){
		Object removed = elementData[index];
		for(int i = index+1 ; i <= size-1 ; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
		
		
	}
	public Object removeFirst() {
		return remove(0);
	}
	public  Object removeLast() {
		return remove(size-1);

}
	public Object get(int index) {
		return elementData[index];
	}
	public int size() {
		return size;
	}
	public int indexOf(Object o) {
		for(int i = 0 ; i < size ; i ++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	public ListIterator listIterator() {
		return new ListIterator();
	}
	class ListIterator{
		private int nextIndex = 0;
		public Object next() {
			Object returnData = elementData[nextIndex];
			nextIndex++;
			return returnData;
			//return elementData[nextIndex++];
			
		}
	}
	
}