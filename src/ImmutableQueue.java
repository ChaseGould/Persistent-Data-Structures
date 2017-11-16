import java.util.Comparator;

public class ImmutableQueue <E extends Comparable> implements Comparator<E>{
	
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
	
	public ImmutableQueue enqueue(Comparable element)
	{
		return new ImmutableQueue(this.linky.AddToListusingIterator(element));
	}
	
	/*Method removes from  end of list which contains the first stored element.
	Queue is a First in First Out type of data structure.*/
	public ImmutableQueue dequeue() //doesnt return the dequeue value
	{
		return new ImmutableQueue(this.linky.removeFromTail());
	}
	
	//method returns true is Queue is empty and false if queue is populated
	public Boolean isEmpty()
	{
		return this.linky.isEmpty();
	}
	
	public Boolean equals(ImmutableQueue<E> queuey2)
	{
		return this.linky.isEqual(queuey2.linky);
	}
	
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
	public int compare(E arg0, E arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
