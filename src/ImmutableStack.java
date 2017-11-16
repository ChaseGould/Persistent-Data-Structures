/*dont need to return any values!
/* need to implement iterator interface can look at values from iterator
 * so you wont need to return values */
 

public class ImmutableStack <E extends Comparable> {
	
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
		return new ImmutableStack(this.linky.AddToList(element));
	}

	//Method removes from tail because stack is a Last in First Out type of data structure.
	public ImmutableStack pop()
	{	
		return new ImmutableStack(this.linky.removeFromTail());
	}
	
	//Method returns true if stack is empty, and false if stack is not empty
	public Boolean isEmpty()
	{	
		return this.linky.isEmpty();
	}
	
	//may not be necessary
	public Comparable peek()
	{
		return this.linky.finder(0);
	}
	
	//finder used for testing should replace with iterator
	public Comparable finder(int x)
	{
		return this.linky.finder(x);
	}

	//method returns size of the ImmutableStack
	public int getSize()
	{
		return this.linky.getSize();
	}
	
}//end of stack
