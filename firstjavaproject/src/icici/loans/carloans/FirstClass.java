package icici.loans.carloans;

public class FirstClass {
	
	
	//Data properties
	int a=10,b=20,c;
	//Behaviours
	
	public void add() {

		c=a+b;
		System.out.println("addition of a &b is :" +c);
	}
	
	public void sub() {
		c=a-b;
		System.out.println("substraction od a&b is :" +c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("krisha");
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
	}

}
