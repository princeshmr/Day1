class DemonstrateStatic 
{
	static int x=10;
	static int y;

	static void disp(int z){
	   System.out.println("x value is "+x);
	   System.out.println("y value is "+y);
	   System.out.println("Z value is "+z);
	}

	static
	{
	    System.out.println("This is static block");
	}
	public static void main(String[] args) 
	{
		disp(5);
	}
}