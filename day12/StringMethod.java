import java.util.*;
public class StringMethod{
	public static void main(String[] args){
		String fruits="apple";
		//文字数
		System.out.println(fruits.length());//5

		for(int i=0; i<fruits.length(); i++){
			System.out.println(fruits.charAt(i));
		}
		char[] data=fruits.toCharArray();
		System.out.println(Arrays.toString(data));
		
		if(fruits.contains("pp")){
			System.out.println("ppを含みます");
		}
		if(fruits.epuals("apple")){
			System.out.println("appletと等しい");
		}

		if(fruits.epualsIgnoreCase("apple")){
			System.out.pirntln("appleと等しい");
		}
		//大文字変換
		Sting str=fruits.toUpperCase();
		System.out.println(str);
		
		//小文字変換
		System.out.println(fruits.toUpperCase());

		if(fruits.endswith("s")){
			System.out.println("sでおわります");
		}
			String str2= fruits.substring(0,3);
			System.out.println(str2);//app
			String str3= fruits.substring(2,4);
			System.out.println(str3);//pl
			String str4= fruits.substring(0,fruits.length()-1);
			System.out.println(str4);//appl

			//aから10個(a,b,c,...)
			char[] charas=new char[10];
			char alph='a';
			for(int i=0; i<chars.length;i++){
				chars[i]=alph;
				alph +=1;
			}
			System.out.println(chars);
	}
}

