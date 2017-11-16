
public class test {

	public static void main(String[] args) {
		
	
		
		ImmutableStack<Integer> stacky = new ImmutableStack<Integer>();
		
		
		Integer t = 5;
		Integer r = 7;
		stacky = stacky.push(t);
		stacky = stacky.push(r);
		stacky = stacky.pop();
		
		System.out.println(stacky.getSize());
		System.out.println("is the stack empty? " + stacky.isEmpty());
		//stacky = stacky.pop();
		
		//System.out.println(stacky.finder(1));
	
		
		
		
		
		
		
		
		
	
		
		

	}

}
