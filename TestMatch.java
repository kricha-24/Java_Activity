
public class TestMatch extends Match{

		@Override
		public float calculateRunRate(int y, int z,int w) {
			// TODO Auto-generated method stub
			int a=w-y;
			int b=90-z;
			float c=a/b;
			return c;
		}

		public int calculateBalls(int y, int z,int w) {
			// TODO Auto-generated method stub
			int d=540-(z*6);
			return d;
		}
		
		public void display(float reqRunrate, int balls) {
			System.out.println("Required Runrate:"+reqRunrate);
			
			
			System.out.println("Need"+(reqRunrate*(balls/6))+"runs in"+balls+"balls");
			
		}

	}

