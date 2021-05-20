

public class Complex {

	double real, imag;
	 <imag> Complex(double a,double b){
		this.real=a;
		this.imag=b;
	}
	public static Complex sum(Complex a,Complex b) {
		// TODO Auto-generated method stub
		Complex temp = new Complex(0,0);
temp.real=a.real+b.real;
temp.imag=a.imag+b.imag;
return temp;
	}
public static void main(String args[]){

	Complex a =new Complex(13,5);
	Complex b =new Complex(1,3);
	Complex temp =sum(a,b);
	System.out.println("Sum is:" +temp.real+"+"+temp.imag+"i");
	

	
}
}
