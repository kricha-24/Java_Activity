public class T20Match extends Match{

	@Override
	public float calculateRunRate(int y, int z,int w) {
		// TODO Auto-generated method stub
		int a=w-y;
		int b=20-z;
		float c=a/b;
		return c;
	}

	public int calculateBalls(int y, int z,int w) {
		// TODO Auto-generated method stub
		int d=120-(z*6);
		return d;
	}
	
	public void display(float reqRunrate, int balls) {
		System.out.println("Required Runrate:"+reqRunrate);
		
		
		System.out.println("Need"+(reqRunrate*(balls/6))+"runs in"+balls+"balls");
		
	}

}