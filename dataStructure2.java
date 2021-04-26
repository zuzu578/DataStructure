
public class ArrayList
{
	//elementData
	//ArrayList implement
	private int size = 0 ; 
	private Object[] elementData = new Object[100];
	//addLast()
	public boolean addFirst(Object element)
	{
		//0번째 index 에 parameter 를 추가한다 
		return add(0,element); 
	}
	public boolean addLast(Object element)
	{
		elementData[size] = element;
		size++; // size +1 증가 
		
		return true; 
	}
	public boolean add(int index ,Object element)
	{
		for(int i = size - 1 ; i >= index; i--)
		{
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
		
	}
	//data 출력 ,제거 
	public String toString()
	{
		String str = "[";
		for (int i = 0; i < size ; i++)
		{
			str += elementData[i];
			if( i < size - 1)
			{
				str +=",";
			}
		
	
			
		}
		return str +"]"; 
		
	}
	//remove function()
	public Object remove(int index) 
	{
		Object removed = elementData[index];
		for (int i = index+1; i <= size-1 ; i++)
		{
			elementData[i -1] = elementData[i];
			
		}
		size--;
		//중복되는 data 제거 
		elementData[size] = null;
		
		return removed;
	}
	public Object removeFirst()
	{
		return remove(0);
	}
	public Object removeLast()
	{
		return remove(size - 1);
	}
	public Object get(int index)
	{
		return elementData[index];
	}
	public int size() {
		
		return size;
	}
	//찾는 값 검색 (찾는값의 index 검색) 
	public int indexOf(Object o)
	{
		for ( int i = 0 ; i < size; i++)
		{
			if(o.equals(elementData[i]))
			{
				return i;
			}
		}
		return -1;
	}
	//Iterator 
	public ListIterator listIterator()
	{
		
		return new ListIterator();
	}
	class ListIterator
	{
		private int nextIndex = 0;
		public boolean hasNext()
		{
			
		return nextIndex < size();
		}
		public Object next()
		{
			Object returnData = elementData[nextIndex];
			nextIndex++;
			return returnData;
		}
		public Object previous()
		{
			return elementData[--nextIndex];
		}
		public boolean hasPrevious()
		{
			return nextIndex > 0;
		}
		//중간에 낑겨넣기 
		public void add(Object element)
		{
			ArrayList.this.add(nextIndex, element);
		}
		//삭제 
		public void remove()
		{
			ArrayList.this.remove(nextIndex - 1);
			nextIndex --;
			
			
		}
		
	}
}
