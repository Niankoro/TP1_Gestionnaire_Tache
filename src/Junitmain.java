import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class Junitmain {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	main principale= new main();
	boolean output = principale.addMembre();
	assertEquals(true,output);
	}
	

}
