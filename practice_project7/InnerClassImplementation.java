package practice_project7;

public class InnerClassImplementation {

	public class world{

		private int NoOfWonders=7;


		public class india{
			private int NoOfWondersInIndia=1;

			public void displayNoOfWonders() {
				System.out.println("The Numbers of wonders in india: "+NoOfWondersInIndia);



			}
		}

		public void displayNoOfWonders() {
			System.out.println("The No of wonders in world: "+NoOfWonders);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassImplementation innerclass=new InnerClassImplementation();
		InnerClassImplementation.world outer=innerclass.new world();
		InnerClassImplementation.world.india inner=outer.new india();
		
		outer.displayNoOfWonders();
		inner.displayNoOfWonders();

	}

}
