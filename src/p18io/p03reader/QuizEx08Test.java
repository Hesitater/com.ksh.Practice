package p18io.p03reader;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class QuizEx08Test {

	@Test
	void test() throws Exception {
		QuizEx08 e = new QuizEx08();
		
		
		 assertEquals("a가,b나,c다,라마,바사", e.split(2));
		 assertEquals("a가b,나c다,라마바,사", e.split(3));
		 
	}
	
	@Test
	void testStringConstructor() {
		char[] arr1 = {'j', 'a', 'v', 'a'};
		
		assertEquals("java", new String(arr1));
		assertEquals("ja", new String(arr1, 0, 2));
		assertEquals("va", new String(arr1, 2, 2));
	}

}
