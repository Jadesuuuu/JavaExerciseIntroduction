package calculator;

public class GenericsCalculator<T extends Number> {
	private T num_1;
	private T num_2;
	
	public GenericsCalculator(T num_1, T num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}
	
	public double add () {
		return num_1.doubleValue() + num_2.doubleValue();
	}
	
	public double subtract () {
		return num_1.doubleValue() - num_2.doubleValue();
	}
	
	public double multiply () {
		return num_1.doubleValue() * num_2.doubleValue();
	}
	
	public double divide() {
		return num_1.doubleValue() / num_2.doubleValue();
	}

}
