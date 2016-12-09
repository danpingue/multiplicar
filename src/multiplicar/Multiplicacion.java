package multiplicar;

public class Multiplicacion {
	private Integer mult1;
	private Integer mult2;
	
	public static int multiplicacion(int a, int b){
		return a*b;
	}
	
	public Integer getMult1(){
		return mult1;
	}
	public void setMult1(Integer mult1){
		this.mult1 = mult1;
	}
	
	public Integer getMult2(){
		return mult2;
	}
	public void setMult2(Integer mult2){
		this.mult2 = mult2;
	}
}
