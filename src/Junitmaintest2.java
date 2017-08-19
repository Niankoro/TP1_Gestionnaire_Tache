import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class Junitmaintest2 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		main principale= new main();
		boolean output = principale.addTache();
		assertEquals(true,output);
	}

}
