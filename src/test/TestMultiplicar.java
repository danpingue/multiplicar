package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplicar {
	@Test
	public void testMultiplicar(){
		assertEquals(4, mult(2,2));
	}
	
	@Test
	public void testMultiplicar2(){
		assertEquals(6, mult(3,2));
	}
	
	int mult(int a, int b){
		return multiplicar.Multiplicacion.multiplicacion(a, b);
	}
}
