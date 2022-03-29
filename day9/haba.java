import java.util.*;
public class Haba{
	public static void main(String[] args){
		System.out.print("幅>>");
		/*
		int w= new Scanner(System.in).nextInt();

		for(int i =0; i<3; i++){
			for(int j= 0; j<w; j++){
				int n = new Random().nextInt(9)+1;
				System.out.print(n);
			}
			System.out.println();
		}
		*/
		int w= new Scanner(System.in).nextInt();

		boolean isWin= false;
		for(int i =0; i<3; i++){
			boolean isLine = true;
			int first =0;
			for(int j= 0; j<w; j++){
				int n = new Random().nextInt(9)+1;
				if(j==0){
					first=n;
				}else{
					if(first !=n){
						isLine=false;
					}
				}
				System.out.print(n);
			}		
			if(isLine){
				isWin=true;
			}
			System.out.println();
		}
			System.out.println(isWin?"あたり":"はずれ");
	}
}

