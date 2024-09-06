package task;

public class Shopping {
	
		 static int balance=10000;
		void withdrow(int amt) {
			balance=balance-amt;
			System.out.println( "remaning balance="+balance);
		}
		public static void main(String args[]) {
		Shopping s = new Shopping();
		s.withdrow(2000);
		s.withdrow(5000);
		s.withdrow(2500);
		s.withdrow(560);


		}
}



