class Child extends Parent
{
	 public void method1() 
	 {
	 System.out.println ("Child's method1()");
	 } 
public static void main(String args[])
{
Parent p = new Child(); 
p.method2(); //calls method2 in parent class 
}
}

/*Result
In main method, Parent class method 2 is called
Option C Prints :
Parent's method2()
Parent's method1()
*/
