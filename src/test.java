
public class test {

	public static void main(String[] args) {
		
	
		
		ImmutableStack<Integer> stacky = new ImmutableStack<Integer>();
		ImmutableStack<Integer> stacky2 = new ImmutableStack<Integer>();
		ImmutableQueue<Integer> queuey = new ImmutableQueue<Integer>();
		ImmutableQueue<Integer> queuey2 = new ImmutableQueue<Integer>();
		
		Integer t = 5;
		Integer r = 7;
		Integer k = 9;
		stacky = stacky.push(t);
		stacky2 = stacky2.push(t);
		
		queuey = queuey.enqueue(t);
		queuey2 = queuey2.enqueue(t);
		
		
		System.out.println(stacky.equals(stacky2));

		//System.out.println("is the stack empty? " + stacky.isEmpty());
		//stacky = stacky.pop();
		
		//System.out.println(stacky.finder(1));
	
		
		
		
		
		
		
		
		
	
		
		

	}

}
