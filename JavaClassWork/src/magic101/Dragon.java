package magic101;

public class Dragon extends Enemy{
	//vars
	private boolean flying;
	private boolean breathingFire;
	private static int numLegends = 0;
	//constructors m
	public Dragon() {
		super();
		setFlying(true);
		setBreathingFire(false);
	}
	public Dragon(String name,int might,boolean isHostile) {
		super(name,might,isHostile);
		setFlying(true);
		setBreathingFire(false);
		numLegends += (might>1000)?1:0;

	}public Dragon(String name,int might,boolean isHostile,boolean flying,boolean breathingFire) {
		super(name,might,isHostile);
		this.flying = flying;
		this.breathingFire = breathingFire;
		numLegends+= (might>1000)?1:0;

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
	public boolean canRun() {
		return !(flying&&breathingFire)||might>100;
	}
	public String mightReact() {
		return (might<10)?"weak":(might<20)?"average":"stronk";
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"\nisflying: "+flying+"\nisBreathingFire: "+breathingFire+"\n";
	}
	public static int getNumLegends() {
		return numLegends;
	}
}
