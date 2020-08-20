package magic101;

public class Driver {
	public static void main(String[] args) {
		Dragon bolas = new Dragon("Nicol Bolas",1000,true,true,true);
		Monster mem = new Monster("Memnrach",1000,true,"artifact",false);
		Monster Utamog = new Monster("Ulamog",1000000,true,"devoid",false);

		Enemy[] ene = {bolas,mem,Utamog};
		for(Enemy e : ene) {
			System.out.println(e.toString());
		}
	}
}
