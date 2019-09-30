package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class p1Test {

	@Test
	void test() {
		p1 o=new p1();
		int out=o.square(4);
		assertEquals(16,out);
	}

}
