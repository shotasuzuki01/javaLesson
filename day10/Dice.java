import java.util.*;
public class Dice{
	public static void main(String[] args){
		int[] balls = {1,2,3,4,5};
		for(int i=0; i<balls.length-1;i++){
			int index = new Random().netInt(balls.length-i)+i;
			int tmp =balls[index];
			bolls[index]=balls[i];
			balls[i];=tmp;
		}
		System.out.println(Arrays.toString(balls));
	}
}

