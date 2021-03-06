package triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class testi {
		private int a;
	    private int b;
	    private int c;
	    private String expected;
	    
	    public testi(int a,int b, int c, String expected){
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.expected= expected;
	        
	        }
	    
	    @Parameters
	    public static Collection<Object[]> getData(){
	    return Arrays.asList(new Object[][]{
		    {3,5,5,"isosceles"},
		    {6,6,8,"isosceles"}
		    });
		    }
	    
	    @Test
	    public void test() {
	    assertEquals(this.expected,TTB.triangleshape(a,b,c));
	    }
}