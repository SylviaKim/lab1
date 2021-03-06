package triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class teste {
		private int a;
	    private int b;
	    private int c;
	    private String expected;
	    
	    public teste(int a,int b, int c, String expected){
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.expected= expected;
	    }
	    
	    @Parameters
	    public static Collection<Object[]> getData(){
	    	return Arrays.asList(new Object[][]{
	    		{1,1,1,"equilateral"},
	    	});
	    }
	    
	    @Test
	    public void test() {
	    	assertEquals(this.expected,TTB.triangleshape(a,b,c));
	    }
}