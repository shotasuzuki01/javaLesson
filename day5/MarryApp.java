import java.util.*;
public class MarryApp{
	public static void main(String[] args){
		/*
		 *女性16、男性18
		 *32歳で女性のあなたは結婚できます
		 *17歳で男性のあなたは結婚できません
		 *
		 * /
		Syem.out.print("性別（男性,女性)>>");
		Stng gender =new Scanner(System.in).next();
		Syem.out.print("年齢>>");
		inage = new Scanner(System.in).nextInt();

		boean ok;
		ifender.equals("男性")){
			(age >=18){
			System.out.println(age+"歳で"+gender+"のあなたは結婚できます");
		}ee{
			 = false;
		}
		}	
		ifge <=17){
			stem.out.println("１７歳であなたは結婚できません");
		}ee{
			stem.out.println("結婚できます");
		}j
*/
if(gender.contains("女")&& age >=16||
		(gender.contains("男")&& age >=18)){
	System.out.println(age+"歳"で+gender+"のあなたは結婚できます");
		}else{
	System.out.println(age+"歳"で+gender+"のあなたは結婚できせん");
}
}

