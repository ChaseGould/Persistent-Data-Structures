
public class test {

	public static void main(String[] args) {
		
		/*
		Integer[] array = new Integer[]{1,2};
		Integer[] array2 = new Integer[] {1,2, 3};
		
		LinkedList<Integer> linky = new LinkedList<>(array);
		LinkedList<Integer> linky2 = new LinkedList<>(array2);
		
		System.out.println(linky.isEqual(linky2));
		*/
		
		Integer[] array = new Integer[]{1,2};
		LinkedList<Integer> linky = new LinkedList<>(array);
		Integer input = 5;
		
		//causing error with toArray
		linky.AddToList(input);
		

	}

}
