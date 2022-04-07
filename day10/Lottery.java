import java.util.*;
public class Lottery{
	public static void main(String[] args){
		int[] num= new int[101];
		for(int i=0;i<num.length;i++){
			num[i]=i;
		}
		for(int i=0; i<num; i++){
			int index =new Random().nextInt(num.length-i)+1;
			int tmp = num[index];
				num[index]=num[i];
				num[i]=tmp;
		}
		System.out.println("何枚？");
		int answer= new Scanner(System.in).nextInt();
		int[] myNum= new int[anser];
			for(int i=0; i<myNum.length;i++){
				myNum[i]=num[i];
			}
			System.out.println(Arrays.toString(myNum));
			int win= new Random().next(101);
			System.out.print("当選番号"+win);

	}

}


