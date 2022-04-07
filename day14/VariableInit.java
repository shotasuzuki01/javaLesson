import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		/*
		System.out.println(n);
		*/
		/*
		 * javaは条件式に入っている変数を調査しない!
		int n;
		int x=5;
		if(x>0){
			n=10;
		System.out.println(n);
		*/
		/*ok
		int n;
		if(5>0){
			n=10;
		}ok if else文はどちらか一方に値がはいる
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n=20;
		}
		System.out.println(n);
		*/
		/*NG
		int n;
		int x=5;
		if(x>10){
			n=10;
		}else if(x<=0){
			n=20;
		}
		System.out.println(n);
		*/
		/*
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			//n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
		/*
		int n=new Random().next(3);
		String fortune;
		switch(n){
			case 0:
				fortune="大吉";
				break;
			case 1:
				fortune="吉";
				break;
			default:
				fortune="吉";
				break;
		}
		System.out.println(n);
		/*ok
		int n;
		if(true){
			n=10;
		}
		System.out.println(n);
		*/
		/*NG
		int n;
		if(isture){
			n=10;
		}
		/*ok do whileは必ず一回はとおるから
		int n;
		do{
			n=10;
		}while(false);
		System.out.println(n);
		}
		*/
		/*NG
		 * 継続条件に変数が入っている
		int n;
		for(int
	
		}
}

