package ejerciciosThinkJavaCap5;

public class Buzz {
	public static void baffle(String blimp) { //rattle
		System.out.println(blimp);//3   // print rattle
		zippo("ping", -5);
	}

	public static void zippo(String quince, int flag) { // rattle, 13
		if (flag < 0) { 
			System.out.println(quince + " zoop");//4  //quince es ping
		} else {
			System.out.println("ik"); //2
			baffle(quince); //rattle
			System.out.println("boo-wa-ha-ha"); //5
		}
	}

	public static void main(String[] args) {
		zippo("rattle", 13); //1
	}
}
