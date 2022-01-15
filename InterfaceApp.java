interface Calculable {
    int sum(int v1, int v2);
}
interface Add{
	double sum1(int v1, int v2);
}
class Real implements Calculable, Add{

	@Override
	public int sum(int v1, int v2) {
		// TODO Auto-generated method stub
		return 20;

	}

	@Override
	public double sum1(int v1, int v2) {
		// TODO Auto-generated method stub
		return 15;
	}

}
class RealAdd extends Real {
	public void add() {
		System.out.println();
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		Real c = new Real();        
		System.out.println(c.sum(19, 3));
	}

}
