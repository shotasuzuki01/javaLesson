import java.util.*;
public class Methood1{
	public static void main(String[] args){
		int max= maxOf(3,8);
		System.out.println(max);
		double area =calcTriangleArea(3.0,2.8);
		System.out.println(area);
		boolean isSame=isSame(new int[]{3,3,3,});
		if(isSame){
			System.out.println("要素はすべて正しい")
		};
	}else{
		ubt price=2800;
		int tax= 10;
		int taxIn=calcTaxIn(
			System.out.println("要素はすべて等しいわけではありません");
			int taxIn =calcTaxs(price.tax);
			System.out.print("身長(cm)");
			double height=new Scanner(System.in).nextDouble();
			System.out.print("体重(kg)");
			double weight=new Scanner(System.in).nextDouble();
			double bmi =calcBMI(weight,height);
			System.out.printf("BMI:%d.2fn",bmi);

	}
	public static int maxOf(int a,int b){
		return a>b?a:b;
	}
	public static double calcTriangleArea(double bottom,double height){
		double area = bottom*height/2;
		return area;
	}
	public static boolean isSame(int[] arr){
		int first=[0];
		for(int i=1; i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
	public static int calcTaxIn(int price,int tax{
		int taxIn = (int)(price*(1+tax/100));
		return 
	}
	public static double calcBMI(double weightkg,double heightcm){
		double bmi= weightkg / (heightcm/100*heightcm/100);
		return bmi;
	}
	}
}

