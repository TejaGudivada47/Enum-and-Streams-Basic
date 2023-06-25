package javabasic;

public enum Operation {
Add(){
	public void displayResult(int a,int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
},
sub(){
	public void displayResult(int a,int b) {
		System.out.println(a+"-"+b+"="+(a-b));
	}
};
	abstract public void displayResult(int a,int b);
}
class EnumExample{
	public EnumExample(int x,int y,Operation opt) {
		opt.displayResult(x, y);
	}
	public static void main(String args[]) {
		EnumExample ex= new EnumExample(28,90,Operation.Add );
	}
}
