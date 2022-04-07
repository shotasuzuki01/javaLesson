import java.util.*;
public class Dice{
	public static void main(String[] args){
		int dice = new Random().nextInt(6)+1;
		/*
		if(dice%2==0){
			System.out.println("偶数です");
		}else{
			System.out.println("奇数です");
		}
		*/
		//条件演算子(三項演算子)
		/*String result = num % 2 ==0?"偶数":"奇数";*/
		System.out.printf("%dは%sです%n",num,num%2==0?"偶数":"奇数");
	}
}

