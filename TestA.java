import java.util.*;
public class TestA{
	public static void main(String[] args){
		int num = new Scanner(System.in).nextInt();
		int[] scores=new int[num];
		for(int i=0; i<scores.length;i++){
			int ram = new Random().nextInt(101);
		}
		for(in i=0; i<scores.length-1;i++){
			for(int j=i+1; j<scores.length; j++){
				if(scores[i]<scores[j]){
					int temp=scores[i];
					scores[i]=scores[j];
					scores[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(scores));
	}
}


