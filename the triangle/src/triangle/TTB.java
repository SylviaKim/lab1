package triangle;

public class TTB {
	
	public static String triangleshape( int a, int b, int c ){
        	
		int sumab = a + b;
		int sumbc = b + c;
		int sumca = c + a;
		
		if( sumab <= c || sumbc <= a || sumca <= b){
			return "not-a-triangle";
		}
			
		else if( a!=0 && a == b && a == c && b == c ){
        	return "equilateral";
        }
		
        else if( a!=0 && ( a == b || a == c || b == c )){
        	return "isosceles";
        }
        else{
        	return "scalene";
        }
        
        
        }
}
