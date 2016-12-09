package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplicar {
	@Test
	public void testMultiplicar(){
		assertEquals(4, mult(2,2));
	}
	
	int mult(int a, int b){
		return multiplicar.Multiplicacion.multiplicacion(a, b);
	}
}
