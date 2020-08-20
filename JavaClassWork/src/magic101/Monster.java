package magic101;

public class Monster extends Enemy{
	//vars
	private boolean isDummy;
	private String element;
	//constructors
	public Monster() {
		super();
		this.element = "water";
		this.isDummy = false;
	}
	public Monster(String name,int might,boolean isHostile) {
		this.name=name;
		this.might = might;
		this.isHostile = isHostile;

	}public Monster(String name,int might,boolean isHostile,String element,boolean isDummy) {
		this.name=name;
		this.might = might;
		this.isHostile = isHostile;
		this.element = element;
		this.isDummy = isDummy;

	}//end full constructor
	public String mightReact() {
		return (might<10)?"weak":(might<20)?"average":"stronk";
	}
	//getters/setters
	
	//toString
	@Override
	public String toString() {
		return super.toString()+"\nisDummy: "+isDummy+"\nelement: "+element+"\n";
	}
	public boolean isDummy() {
		return isDummy;
	}
	public void setDummy(boolean isDummy) {
		this.isDummy = isDummy;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public String isAqua() {
		return (element.equalsIgnoreCase("water"))?"usless":"might be dangrous";
	}
}
