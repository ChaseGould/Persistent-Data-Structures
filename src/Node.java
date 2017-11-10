
public class Node <E extends Comparable> implements Comparable <Node<E>>{
	
	private final E element;
	private final Node<E> next;
	
	//creating a single node
	public Node(Object input) {
		this.element = (E) input;
		this.next = null; //empty input because there is no next node to follow
	}
	
	public Node(Object input, Node<E> next) {
		this.element = (E) input;
		this.next = next;
	}
	
	public int compareTo(Node<E> input)
	{
		return this.element.compareTo(input.getElement());
	}
	
	
	
	
	//getters
	public E getElement()
	{
		return this.element;
	}
	
	public Node<E> getNext()
	{
		return this.next;
	}
	

}
