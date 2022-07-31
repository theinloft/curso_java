package entities;

public class Triangle {
	public double x,y,z;
	
public double calculaArea(){
	double p = (x+y+z)/ 2.0;
	double result = Math.sqrt(p *(p-x)*(p-y)*(p-z));
	return result;
}

}
