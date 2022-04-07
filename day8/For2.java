import java.util.*;
public class For2{
	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		for(int e = 0; e< num; e++){
			for(int i = 0; i< num; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

