import java.util.* ;
public class Array {
	
	public static void main (String args[]) {
		//system.out.println("Hello") ;
		//int a ;
		ArrayList <Integer> numbers = new ArrayList<Integer>() ;
		numbers.add(10) ;
		//System.out.println(numbers.get(0)) ;
		
		for(int i=0;i<numbers.size() ;i++){
			System.out.println(numbers.get(i)) ;
		}
		for(Integer value : numbers){
			System.out.println(value) ;
		}
		//this is very slow 
		numbers.remove(0) ;
	}
}

