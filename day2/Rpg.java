public class Rpg{
	public static void main(String[] args){
String name="ロト";
int hp=100;
System.out.println("スライムがあわたれた!");
System.out.println("スライムの先制攻撃");
System.out.println(name+"は30のダメージを受けた");
hp = hp - 30;
System.out.println(name+"("+ hp +")");
System.out.println(name+"は力尽きた");
System.out.println("gameover");
	}
}

