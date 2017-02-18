
//method overloading example
class Student {
public void sum(int a,int b)
{
	System.out.println("value in Int" + a+b);
	
}


public void sum(float a , float b , int c)
{
	c = (int)(a+b);//type casting
	System.out.println("c" + c);
}
}

public class MethodOverlodProgram extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverlodProgram p =new MethodOverlodProgram();
		p.sum(12, 15, 45);

	}

}
