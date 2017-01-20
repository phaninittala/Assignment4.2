class Parent{
private void method1(){
 System.out.println ("Parent's method1()"); //prints this statement when this method is called
}
public void method2() {
 System.out.println ("Parent's method2()"); //prints this message when this method is called
method1(); //calls method1
}
}
 
