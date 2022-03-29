import java.util.*;
public class Kakezann{
	public static void main(String[] args){
		System.out.print("START");
		int a = new Scanner(System.in).nextInt();
		System.out.print("End");
		int b = new Scanner(System.in).nextInt();

		for(int i = a; i<=b; i++){
			for(int j = 1;j<=9; j++){
				System.out.printf(i+"*"+j+"="+"%2d"+" ",i*j);
			}
			System.out.println();
		}
	}
}

