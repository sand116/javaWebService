package chapter03.backend;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class CharacterCounterTests {
	
	//����� IllegalArgumentException�� ȣ����� ������ ������ �߻��Ѵ�.
	@Test(expected=IllegalArgumentException.class)
	public void testNullInput() {
		CharacterCounter.counterCharacters(null);
	}
	@Test
	public void testStringInput() {
		Map<Character, Integer> map = CharacterCounter.counterCharacters("!a!A!");
		//assertEquals(int, int)
		assertEquals(map.size(), 3);
		assertEquals(map.get('a').intValue(), 1);
		assertEquals(map.get('!').intValue(), 3);
		assertEquals(map.get('A').intValue(), 1);
		
	}
	
	

}
