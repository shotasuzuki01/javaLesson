import java.util.*;
public class HighLow{
	public static void main(String[] args){
		int card1 = new Random().nextInt(13)+1;
		System.out.println("1枚目のカードは"+card1+"です");
		System.out.println("さて次のカードより(High or Low) ？>>");
		String ans = new Scanner(System.in).next();
		int card2 = new Random().nextInt(13)+1;
		System.out.println(card2);

		if(ans.equalsIgnoreCase("High")&& card1 < card2 || ans.equalsIgnoreCase("low")&& card1 > card2){
			System.out.println("You Win!!");
		}else{
			System.out.println("You Lose ...");
		}

	}
}

