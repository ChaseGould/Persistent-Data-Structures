
public class ImmutableQueue <E> {
	
	/*dont need to return any values! */

	private final LinkedList linky;
	
	//Stack constructors
	public ImmutableQueue() //creates an empty stack
	{
		this.linky = new LinkedList();
	}
	
	public ImmutableQueue(LinkedList input)
	{
		this.linky = input;
	}
	
	/*
	//queue methods
	public void enqueue(E input)
	{
		this.linky = new Queue(this.linky.addToList(input));
	}
	
	public E dequeue() //doesnt return the dequeue value
	{
		E temp = (E) this.linky.getFirstElement();
		this.linky.removeFromFront();
		return temp;
	}
	*/
	
	//public is empty()
	
}
