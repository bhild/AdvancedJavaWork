package magic101;

public class Sorcerer {
	private boolean isNatural;
	private int knownSpells;
	private String name;
	private String element;
	private static int numSorcerers = 0;
	public Sorcerer() {
		isNatural = true;
		knownSpells = 0;
		name = "Wanderer";
		element = "chaos";
		numSorcerers++;
	}
	public Sorcerer(boolean isNatural, int knownSpells,	String name, String element) {
		this.isNatural=isNatural;
		this.knownSpells=knownSpells;
		this.name=name;
		this.element=element;
		numSorcerers++;
	}
	public Sorcerer(String name, String element) {
		this.name=name;
		this.element=element;
		numSorcerers++;
	}
	public Sorcerer(int knownSpells, String name, String element) {
		this.knownSpells=knownSpells;
		this.name=name;
		this.element=element;
		numSorcerers++;
	}
	public boolean isNatural() {
		return isNatural;
	}
	public void setNatural(boolean isNatural) {
		this.isNatural = isNatural;
	}
	public int getKnownSpells() {
		return knownSpells;
	}
	public void setKnownSpells(int knownSpells) {
		this.knownSpells = knownSpells;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public static int getNumSorcerers() {
		return numSorcerers;
	}
	
}
