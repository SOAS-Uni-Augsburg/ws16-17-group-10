
public class Aufgabe01 {
	
	private static double[] outsideTemp = new double[]{10.0, 25.0, 30.0};
	static double tMin = 15.0;
	static double tMax = 20.0;
	static double currentTemp = 18.0;
	static double middle;
	
	public static void main(String[] args){
		for(int i = 0; i < outsideTemp.length; i++){
			middle = getArithmeticMiddle(outsideTemp[i], currentTemp);
			if(middle < tMin){
				currentTemp = heat(currentTemp);
			}else if(middle > tMax){
				currentTemp = cool(currentTemp);
			}else
				currentTemp = passive(currentTemp);
			System.out.println(currentTemp);
		}
	}
	
	private static double cool(double temp){
		return Math.max(tMin, temp - 5.0);
	}
	private static double heat(double temp){
		return Math.min(tMax, temp + 5.0);
	}
	private static double passive(double temp){
		return temp;
	}
	public static double getArithmeticMiddle(double outside, double inside){
		return (inside + outside) / 2.0;
	}
}
