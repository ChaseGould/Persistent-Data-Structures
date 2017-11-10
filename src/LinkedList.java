import java.util.Arrays;

public class LinkedList<E extends Comparable> {
		
		private final Node head;
		private final int size;
		
		public LinkedList ()
		{
			this.head = new Node<E>(null, null);
			this.size = 0;
		}

		//note sure if this constructor is necessary
		public LinkedList (Object element)
		{
			Node<E> temp = new Node(element, null);
			this.head = new Node<E>(null, temp);
			this.size = 1;
		}
		
		public LinkedList (Object [] objectArray)
		{
			this.head = new Node<E>(null, chelper(objectArray));
			this.size = objectArray.length;
		}
		
		
		
		public Node<E> chelper(Object [] input)
		{
			int size = input.length;
			if (input.length == 1)
			{
				return new Node<E>(input[0]);
			}
			else
			{
				return new Node<E>(input[0], chelper(Arrays.copyOfRange(input, 1, input.length)));
			}
		}//end of method
		
		public LinkedList AddToList(Object input)
		{
			Node<E> temp = new Node(input, null);
			Object[] original = this.toArray();
			Object[] newElement = new Object[] {temp};
			return new LinkedList<E>(addAll(original, newElement));
		}
		
		public LinkedList <E> removeFromFront()
		{
			return new LinkedList(Arrays.copyOfRange(this.toArray(), 1, (this.size)));
		}
		
		/*
		pop method: 
		remove from tail method
		then get last.
		*/
		
		public LinkedList <E> removeFromTail()
		{
			return new LinkedList(Arrays.copyOfRange(this.toArray(), 0 , (this.size - 1)));
		}
		
		public E getFirst()
		{
			return (E) head.getNext().getElement();
		}
		
		
		public E getLast()
		{
			Node<E> temp = head.getNext();
			for (int i = 0; i < this.size; i += 1)
			{
				temp = temp.getNext();
			}
			return temp.getElement();
		}
		
		//adds 2 linkedlists to create one linkedlist
		public LinkedList<E> Add(LinkedList<E> input)
		{
			E[] first = this.toArray();
			E[] second = this.toArray();
			return new LinkedList<E>(addAll(first, second));
		}
		
		
		
		//I don't understand this error
		public E[] toArray()
		{
			Object[] result = new Object[size];
			Node<E> temp = head.getNext();
			for(int i = 0; i < size; i += 1)
			{
				result[i] = temp.getElement();
				temp = temp.getNext();
			}
			return E[] result;
		}
		
		
		
		
		
		//copied from apache commons-lang could not download
		public Object[] addAll(Object[] array1, Object[] array2) {
			if (array1 == null) {
				return array2;
			} else if (array2 == null) {
				return array1;
			}
			Object joinedArray = new Object[array1.length + array2.length];
			System.arraycopy(array1, 0, joinedArray, 0, array1.length);
			System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
			return (E[]) joinedArray;
		}
		
		public boolean isEqual(LinkedList<E> input)
		{
			if (this.size == input.size)
			{
				Node<E> t1 = this.head.getNext();
				Node<E> t2 = input.head.getNext();
				for (int i = 0; i < size; i += 1)
				{
					if (t1.compareTo(t2) == 0)
					{
						t1 = t1.getNext();
						t2 = t2.getNext();
					}
					else
					{
						return false;
					}
				}//end of for loop	*if algorithm reaches end of for loop than result must be true
				return true;
			}//end of o.g if * in the case that the original if condition is not met the result must be false
			else
			{
				return false;
			}
			
			/*had to put another return statement for method to run
			should never reach this line*/
			
		}//end of method
		
	//getter methods
		
	public Node<E> getHead()
	{
		return head;
	}
		
	public int getSize()
	{
		return size;
	}
		
		
	}//end of linked list