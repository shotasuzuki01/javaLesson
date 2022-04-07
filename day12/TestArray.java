import java.util.*;
public class TestArray{
	public static void main(String[] args){
		int[][] numes=new int[3][3];
		for(int i=0; i<numes.length;i++){
			for(int j=0; j<numes[i].length;j++){
				numes[i][j]= new Random().nextInt(9)+1;
			}
			System.out.println(Arrays.toString(numes[i]));
		}
	}
}

