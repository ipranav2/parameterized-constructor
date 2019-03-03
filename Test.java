class Test
{
	int x;
	Test(int val)
	{
		System.out.println("object created");
		this.x=val;
	}
	void show()
	{
		System.out.println("value of x: "+x);
	}
	public static void main(String S[])
	{
		Test t1,t2;
		t1=new Test(10);
		t2=new Test(20);
		t1.show();
		t2.show();
	}
}