import junit.framework.Test;
import junit.framework.TestSuite;

public class Testsuit1 {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(Testcase1.class);
		suite.addTestSuite(Testcase2.class);
		suite.addTestSuite(Testcase3.class);
		suite.addTestSuite(Testcase4.class);
		suite.addTestSuite(Testcase5.class);
		suite.addTestSuite(Testcase6.class);
		suite.addTestSuite(Testcase7.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
