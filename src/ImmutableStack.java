import java.util.Comparator;

/*dont need to return any values!
/* need to implement iterator interface can look at values from iterator
 * so you wont need to return values */
 

public class ImmutableStack <E extends Comparable> implements Comparator<E> {
	
	//ImmutableStack fields
	private final LinkedList<E> linky;
	
	//ImmutableStack constructors
	//ImmutableStack constructor with no arguments
	public ImmutableStack() //creates an empty stack
	{
		this.linky = new LinkedList();
	}
	
	//ImmutableStack constructor with a LinkedList as an argument
	public ImmutableStack(LinkedList input)
	{
		this.linky = input;
	}
	
	//stack methods
	//Method pushes an element onto the stack
	public ImmutableStack push(E element)
	{
		return new ImmutableStack(this.linky.AddToListusingIterator(element));
	}

	//Method removes from front of list which contains the most rescently stored element.
	//stack is a Last in First Out type of data structure.
	public ImmutableStack pop()
	{	
		return new ImmutableStack(this.linky.removeFromFront());
	}
	
	//Method returns true if stack is empty, and false if stack is not empty
	public Boolean isEmpty()
	{	
		return this.linky.isEmpty();
	}
	
	public Boolean equals(ImmutableStack stack2)
	{
		return this.linky.isEqual(stack2.linky);
	}
	
	/* peek not using iterator
	public Comparable peek()
	{
		return this.linky.finder(0);
	}
	*/
	
	//Peeks element on top of stack
	public Comparable peek()
	{
		return this.linky.iterator().next();
	}
	
	/*finder not using iterator
	public Comparable finder(int x)
	{
		return this.linky.finder(x);
	}*/
	
	//method is used to retrieve any element in the stack
	public Comparable finder(int x)
	{
		return this.linky.finderusingIterator(x);
	}

	//method returns size of the ImmutableStack
	public int getSize()
	{
		return this.linky.getSize();
	}

	@Override
	public int compare(E o1, E o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}//end of stack
