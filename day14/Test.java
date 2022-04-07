import java.util.*;
public class Test{
	public static void main(String[] args){
		/*
		int[][] arrA=new int[2][3];
		for(int i=0;i<arrA.length;i++){
			for(int j=0;j<arrA[i].length;j++){
				int ran = new Random().nextInt(13)+12;
				arrA[i][j]=ran;
			}
			System.out.println(Arrays.toString(arrA[i]));
		}
		*/
		/*
		int[] arrA = new int[3];
		int[] arrB = arrA;
		int[] arrC = arrB;
		arrB[0] = 5;
		arrC[0] = 10;
		arrA[2] = 15;

		System.out.println(arrA[0]);
		System.out.println(arrB[0]);
		System.out.println(arrC[0]);
		*/
		/*
		char[] words={'A','B','C','D','E'};
		System.out.print("行数");
		int numberA=new Scanner(System.in).nextInt();

		int[] arry=new int[numberA];
		for(int i=0;i<arry.length;i++){
			System.out.print((i+1)+":"+arry[i]);
			for(int j=0; j<arry.length;j++){
				arry[i][j]=new Random().nextInt(words.length);
				System.out.print(arry[i][j]);
			}
			System.out.println();
	
		}
		*/
		System.out.print("生徒数を入力");
		int studens=new Scanner(System.in).nextInt();

		int[][] arry=new int[studens][];
		for(int i=0; i<arry.length;i++){
			System.out.printf("%d人目の名前を入力>>",i+1);
			String names=new Scanner(System.in).nextLine();
			for(int j=0; j<arry[i].length;j++){
				System.out.printf("%d人目の%d科目の点数を入力>>",i+1,j+1);
				arry[i][j] =new Scanner(System.in).nextInt();
			}
			System.out.println();
		}


	}
}

