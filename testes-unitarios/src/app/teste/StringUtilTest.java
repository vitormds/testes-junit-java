package app.teste;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import app.StringUtil;


public class StringUtilTest {
	
	@org.junit.Test
	public void testIsEmpty() {
		boolean b;
		b = StringUtil.isEmpty("abc");
		Assert.assertFalse(b);
		
		b = StringUtil.isEmpty(null);
		Assert.assertTrue(b);
		
		b = StringUtil.isEmpty("");
		Assert.assertTrue(b);
		
	}
	@org.junit.Test
	public void testReverse() {
		String r = StringUtil.reverse("abc");
		Assert.assertEquals("cba",r);
		
		r = StringUtil.reverse(null);
		Assert.assertNull(r);
	}
	
	@Before
	public void before() {
		System.out.println("Iniciando o teste");
	}
	
	@After
	public void After() {
		System.out.println("Teste finalizado");
	}
	
}