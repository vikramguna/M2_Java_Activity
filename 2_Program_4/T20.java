public class T20 extends Match {

	public T20() {
		super();
		}

	@Override
	float calculateRunRate() {
	
			return ((getTarget()-getCurrentScore())/(20-getCurrentOver()));
			}
		@Override
	float calculateBalls() { 
		
		return 6*(20-getCurrentOver());
	}
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}