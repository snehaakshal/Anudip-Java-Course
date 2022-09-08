

class Thread1 extends Thread{
	
	synchronized void test1() {
		for(int i=5;i<20;i++) {
			System.out.println(i);
		}
	}
	synchronized void test2() {
		for(int i=6;i<20;i++) {
			System.out.println(i);
		}
	}	
}

class Thread2 extends Thread{
	Thread1 obj;
	
	Thread2(Thread1 obj){
		this.obj=obj;
	}	
	@Override
	public void run() {
		
		obj.test1();
	}
}

class Thread3 extends Thread{
	Thread1 obj1;
	Thread3(Thread1 obj1)
	{
		this.obj1=obj1;
	}
	@Override
	public void run() {
		
		obj1.test2();
	}
}

public class Rose{	

	public static void main(String[] args) {
		
			Thread1 obj = new Thread1();			
			Thread2 obj1 = new Thread2(obj);
			Thread3 obj2 = new Thread3(obj);			
			obj1.start();
			obj2.start();	
		
	}

}