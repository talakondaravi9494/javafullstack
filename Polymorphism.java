package OOPS;

class ClassA{
	void area(int a){}
	void area(int a, float b){}
	void area(float a, int b){}
	void area(float b){}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj=new ClassA();
		obj.area(8.9f);
		obj.area(8.5f,78);
	}

}