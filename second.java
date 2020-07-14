package intellect;

 class second {
	int k;
	float f;
	boolean istrue;
	String p;
	
	public void printValue()
	{
		System.out.println("int default value ="+k);
		System.out.println("float default value ="+f);
		System.out.println("boolean default value ="+istrue);
		System.out.println("string  default value ="+p);
	}
	

	public static void main(String args[])
	{
		second obj=new second();
		
		obj.printValue();
	}
}