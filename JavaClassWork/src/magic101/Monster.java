package magic101;

public class Monster extends Enemy{
	//vars
	private boolean isDummy;
	private String element;
	private static int numDums = 0;
	//constructors
	public Monster() {
		super();
		this.element = "water";
		this.isDummy = false;
	}
	public Monster(String name,int might,boolean isHostile) {
		super(name,might,isHostile);
		this.element = "water";
		this.isDummy = false;

	}public Monster(String name,int might,boolean isHostile,String element,boolean isDummy) {
		super(name,might,isHostile);
		this.element = element;
		this.isDummy = isDummy;
		numDums+=(isDummy)?1:0;

	}//end full constructor
	
	public String isMonstrous() {
		 if (might>1000) {
			return "this is a monster for the ages";
		}
		if (might>100) {
			return "this mosnter is a terror";
		}
		if (might>50) {
			return "very monstorus";
		}
		return "not very monstrous";
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
	public static int getNumDums() {
		return numDums;
	}
}
