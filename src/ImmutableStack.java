import java.util.Arrays;


public class ImmutableStack <E> {
	
	private final LinkedList linky;
	
	//Stack constructors
	public ImmutableStack() //creates an empty stack
	{
		this.linky = new LinkedList();
	}
	
	public ImmutableStack(Object element) //creates an empty stack
	{
		this.linky = new LinkedList(element);
	}
	
	public ImmutableStack(Object[] objectArray)
	{
		this.linky = new LinkedList(objectArray);
	}
	
	//stack methods
	public void push(E input)
	{
		this.linky.AddToList(input);
	}

	public E pop()//doesnt return a value
	{	
		E temp = (E) this.linky.getLast(); //last refers to the last node added *LIFO*
		this.linky.removeFromTail();
		return temp;
	}
	
	public E peek()
	{
		return (E) this.linky.getFirst();
	}

		
	
}//end of stack
