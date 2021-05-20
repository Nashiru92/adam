
import java.io.*;

public class Triangle {

	public static void main(String[] args)throws Exception
	{	
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("enter the side a");
		a=Integer .parseInt(reader.readLine());
		System.out.println("enter the side b");
		b=Integer .parseInt(reader.readLine());
		System.out.println("enter the side c");
		c=Integer .parseInt(reader.readLine());
		
		if(a+b>c && a+c>b && b+c>a){
	}
	System.out.println("yes its a triangle");
	double perimeter=a+b+c;
	System.out.println("perimeter" + perimeter);
	double temp=perimeter*0.5;
	double area=Math.sqrt((temp)*(temp=a)*(temp=b)*(temp=c));
	System.out.println("Area "+area);
}
}