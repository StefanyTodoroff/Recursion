package demo;

public class GreatestCommonDividor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(foo(60, 24));
	}
	
	public static int foo (int x, int y){
	   	if (y == 0)
	     	    return x;
	   	else
	   			return foo(y, x % y);
    }


}
