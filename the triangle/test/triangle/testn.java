package triangle;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class testn {
		private int a;
	    private int b;
	    private int c;
	    private String expected;
	    
	    public testn(int a,int b, int c, String expected){
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.expected= expected;
	        
	        }
	    
	    @Parameters
	    public static Collection<Object[]> getData(){
	    return Arrays.asList(new Object[][]{
		    {1,3,4,"not-a-triangle"},
		    {2,1,4,"not-a-triangle"},
		    {5,3,9,"not-a-triangle"},
		    });
		    }
	    
	    @Test
	    public void test() {
	    assertEquals(this.expected,TTB.triangleshape(a,b,c));
	    }
}