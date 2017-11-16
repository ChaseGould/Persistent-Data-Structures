import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//replacing all arrays with arraylists?

public class LinkedList<E extends Comparable> implements Iterable<E> {
		
		//LinkedList fields
		private final Node head;
		private final int size;
		
		//LinkedList constructor with no arguments
		public LinkedList ()
		{
			this.head = new Node<E>(null, null);
			this.size = 0;
		}
		
		//LinkedList constructor with an arrayList as an argument
		public LinkedList (ArrayList<E> list)
		{
			this.head = new Node<E>(null, chelper(list));
			this.size = list.size();
		}
				
		/*chelper with ArrayLists. Utilizes sublist to make copies
		of specified ranges of the ArrayList.*/
		public Node<E> chelper(List<E> input)
		{
			int size = input.size();
			if (input.size() == 1)
			{
				return new Node<E>(input.get(0));
			}
			else
			{	List<E> subList = new ArrayList<E>(input.subList(1, input.size()));
				return new Node<E>(input.get(0), chelper(subList));
			}
		}
		
		/*Converts LinkedList to ArrayList, add a new element to that ArrayList,
		then returns a new LinkedList with the ArrayList as an input.*/
		public LinkedList<E> AddToList(E element)
		{
			ArrayList<E> tempList = new ArrayList<E>();
			tempList = this.toArrayList();
			tempList.add(element);
			return new LinkedList<E>(tempList);
		}

		
		/*Converts LinkedList to ArrayList, first element is removed from the ArrayList,
		then returns a new LinkedList with the ArrayList as an input*/
		public LinkedList <E> removeFromFront()
		{
			ArrayList<E> list = this.toArrayList();
			ArrayList<E> smallerList = new ArrayList<E>(list.subList(1, list.size()));
			return new LinkedList<E>(smallerList);
		}
		
		
		/*Converts LinkedList to ArrayList, last element is removed from the ArrayList,
		then returns a new LinkedList with the ArrayList as an input*/
		public LinkedList <E> removeFromTail()
		{
			ArrayList<E> list = new ArrayList<E>();
			ArrayList<E> smallerList = new ArrayList<E>();
			list = this.toArrayList();
			smallerList = new ArrayList<E>(list.subList(0, (list.size()-1)));
			return new LinkedList<E>(smallerList);
		}
		
		//returns first element from a LinkedList
		public E getFirstElement()
		{
			return (E) head.getNext().getElement();
		}
		
		//returns last element from a LinkedList
		public E getLastElement()
		{
			Node<E> temp = head;
			for (int i = 0; i < this.size; i += 1)
			{
				temp = temp.getNext();
			}
			return temp.getElement();
		}
		
		/*Method Concatenates two LinkedLists. This method implements the 
		toArrayList and addAllFromList methods which I have defined below.*/
		public LinkedList<E> Add(LinkedList<E> input)
		{
			ArrayList<E> second = input.toArrayList();
			return new LinkedList<E>(this.addAllFromList(second)); 
		}
		
		//Method converts an instance of a linked list into an ArrayList
		public ArrayList<E> toArrayList()
		{
			ArrayList<E> list = new ArrayList<E>();
			Node<E> temp = this.getHead();
			for (int i = 0; i < this.getSize(); i += 1)
			{
				temp = temp.getNext();
				list.add(temp.getElement());
				
			}
           return list; 
        }
		
		/*Method converts an instance of a linked list into an ArrayList
		and takes in another ArrayList as an argument. The two list are concatenated
		and returned as an ArrayList.*/
		public ArrayList<E> addAllFromList(ArrayList<E> list2) {
			ArrayList<E>list1 =  new ArrayList<E>();
			list1 = this.toArrayList();
			if (list1 == null) {
				return list2;
			} else if (list2 == null) {
				return list1;
			}
			ArrayList<E> joinedList = new ArrayList<E>(list1); //initialized with values from list1
			joinedList.addAll(list2); //addAll is an ArrayList method.
			return joinedList;
		}
		
		public Iterator<E> iterator()
		{
			ArrayList<E> iteratorList = new ArrayList<E>();
			iteratorList = this.toArrayList();
			Iterator<E> it = iteratorList.iterator();
			return it;
		}
		
		/*This method takes in an input which is used to find a specific
		element within a LinkedList*/
		public E finder(int x)
		{
			x = inputValidation(x, 0, this.size);
			Node<E> temp = this.getHead();
			for(int i = 0; i <= x; i += 1)
			{
				temp = temp.getNext();
			}
			return temp.getElement();
		}
		
		/*Method returns true if LinkedList is empty
		 * and false if LinkedList is populated*/
		public boolean isEmpty()
		{
			if(this.getSize() > 0)
			{
				return false;
			}
			else 
			{
				return true;
			}
		}
		
		/* Method returns true if two LinkedList are equivalent
		 * returns falls if they are not equivalent.*/
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
		}//end of method
            
	/*This method tests if an input is within certain boundaries.
	 * if the input is not within the boundaries the user is given
	 * the opportunity to input a new value.*/
    public int inputValidation(int x, int min, int max)
	{
		Scanner input = new Scanner(System.in);
		while (x >= max || x < min)
		{
			System.out.println("Invalid index, try entering a new index value.");
			System.out.print("Index value: ");
			x = input.nextInt();
		}
		return x;
	}

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