
public class ImmutableQueue <E> {

	private final LinkedList linky;
	
	//Stack constructors
	public ImmutableQueue() //creates an empty stack
	{
		this.linky = new LinkedList();
	}
	
	public ImmutableQueue(Object element) //creates an empty stack
	{
		this.linky = new LinkedList(element);
	}
	
	public ImmutableQueue(Object[] objectArray)
	{
		this.linky = new LinkedList(objectArray);
	}
	
	//queue methods
	public void enqueue(E input)
	{
		this.linky.AddToList(input);
	}
	
	public E dequeue() //doesnt return the dequeue value
	{
		E temp = (E) this.linky.getFirst();
		this.linky.removeFromFront();
		return temp;
	}
	
	public E front()
	{
		return (E) this.linky.getFirst();
	}
	
	public E back()
	{
		return (E) this.linky.getLast();
	}
	
}
