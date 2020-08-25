package magic101;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		Dragon bolas = new Dragon("Nicol Bolas",1000,true,true,true);
		Dragon nullDragon = new Dragon();
		Monster Utamog = new Monster("Ulamog",1000000,true,"devoid",false);
		Monster mem = new Monster("Memnrach",1000,true,"artifact",false);
		Slime scavengingOoze = new Slime("nameless", 50, true, false, false);
		Slime gelatiunsCube  = new Slime("nameless", 20, true, false, true);
		ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		enemies.add(bolas);
		enemies.add(nullDragon);
		enemies.add(mem);		
		enemies.add(Utamog);
		enemies.add(scavengingOoze);
		enemies.add(gelatiunsCube);

		for(Enemy e : enemies) {
			System.out.println(e.toString());
		}
		System.out.println("Watch out there are "+Enemy.getEnemyCount()
		+" attacking");
		/*Enemy[] ene = {bolas,mem,Utamog};
		for(Enemy e : ene) {
			System.out.println(e.toString());
		}*/
	}
}
