package magic101;

public class Sorcerer {
	private boolean isNatural;
	private int knownSpells;
	private String name;
	private String element;
	public Sorcerer() {}
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
	
}
