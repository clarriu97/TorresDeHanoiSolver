
public class TorresDeHanoi {
	public static void main(String[] args) {
		TorresDeHanoi.run();
	}

	private static void run() {
		// TODO Auto-generated method stub
		hanoi(3,0,2,1);
	}

	private static void hanoi(int m, int a, int b, int c) {
		// TODO Auto-generated method stub
		if(m>0) {
			hanoi(m-1,a,c,b);
			System.out.println("Mueve un aro de " + a + " a " + b);
			hanoi(m-1,c,b,a);
		}
	}
}
