import java.util.*;
public class SortMain{
	public static void main(String[] args){
		System.out.print("人数>>");
		int number =new Scanner(System.in).nextInt();


		int[] scores= new int[number];
		for(int i =0; i<scores.length;i++){
			int random = new Random().nextInt(101);
			scores[i]=random;
		}

		for(int i=0; i<scores.length-1;i++){
			for(int j=i+1; j<scores.length; j++){
				if(scores[i]<scores[j]){
					int tmp = scores[i];
					scores[i]=scores[j];
					scores[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}

