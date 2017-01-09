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
	
	@Test
	public void testMultiplicar3(){
		assertEquals(16, mult(4,4));
	}
	
	@Test
	public void testMultiplicar4(){
		assertEquals(25, mult(5,5));
	}
	
	int mult(int a, int b){
		return multiplicar.Multiplicacion.multiplicacion(a, b);
	}
}
