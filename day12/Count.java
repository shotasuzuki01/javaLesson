import java.util.*;
public class Count{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力>>");
		String count= new Scanner(System.in).nextLine();

		String[] data=count.split(",");

		int sum=0;
		for(int i=0; i<data.length;i++){
			int result=Integer.parseInt(data[i]);
			sum+=result;
		}
		System.out.printf("合計は%dです.",sum);
	}
}

