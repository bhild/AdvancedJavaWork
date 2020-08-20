package magic101;

public class Dragon extends Enemy{
	//vars
	private boolean flying;
	private boolean breathingFire;
	//constructors m
	public Dragon() {
		super();
		setFlying(true);
		setBreathingFire(false);
	}
	public Dragon(String name,int might,boolean isHostile) {
		this.name=name;
		this.might = might;
		this.isHostile = isHostile;

	}public Dragon(String name,int might,boolean isHostile,boolean flying,boolean breathingFire) {
		this.name=name;
		this.might = might;
		this.isHostile = isHostile;
		this.flying = flying;
		this.breathingFire = breathingFire;

	}//end full constructor
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	public boolean isBreathingFire() {
		return breathingFire;
	}
	public void setBreathingFire(boolean breathingFire) {
		this.breathingFire = breathingFire;
	}
	//getters/setters
	
	//toString
	@Override
	public String toString() {
		return super.toString()+"\nisflying: "+flying+"\nisBreathingFire: "+breathingFire+"\n";
	}
}
