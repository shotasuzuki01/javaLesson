import java.util.*;
public class ForTest{
	public static void main(String[] args){
		/*
		for(int i=0; i<5;i++){
			System.out.print("*");
		}
		System.out.print();
		*/
		/*
		for(int i =0; i<3; i++){
			for(int j=0; j<5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i=0;i<5;i++){
			for(int j=0; j<i+1; j++){
				System.out.print("*");
			}
			System.out.print();
		}
		*/
		int num=new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			for(int j=0; j<num-(i+1); j++){
				System.out.println(" ");
			}
			for(int k=0; k<(i+1)*2-1;k++){
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
