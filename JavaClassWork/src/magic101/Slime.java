package magic101;

public class Slime extends Enemy{
	//vars
	//
	private boolean hasForm;
	private boolean isAcidic;
	private static int slimeCount = 0;
	private static int acidCount = 0;
	//constructors m
	public Slime() {
		super();
		setHasForm(true);
		setAcidic(false);
		slimeCount ++;
	}
	public Slime(String name,int might,boolean isHostile) {

		super(name,might,isHostile);
		setHasForm(true);
		setAcidic(false);
		slimeCount ++;

	}public Slime(String name,int might,boolean isHostile,boolean hasForm,boolean isAcidic) {
		super(name,might,isHostile);
		this.setHasForm(hasForm);
		this.setAcidic(isAcidic);
		slimeCount ++;
		acidCount += (isAcidic)?1:0;


	}//end full constructor
	
	//getters/setters
	
	//toString
	@Override
	public String toString() {
		return super.toString()+"\nisAcid: "+isAcidic+"\nHasForm: "+hasForm+"\n";
	}
	public boolean isHasForm() {
		return hasForm;
	}
	public void setHasForm(boolean hasForm) {
		this.hasForm = hasForm;
	}
	public boolean isAcidic() {
		return isAcidic;
	}
	public void setAcidic(boolean isAcidic) {
		this.isAcidic = isAcidic;
	}
	public String reactSlime() {
		if(isAcidic&&hasForm)
			return "run!!!";
		if (isAcidic||hasForm) {
			return "probobly fine";
		}
		return "what a generic slime";
	}
	public boolean isScarry() {
		return (might>10&&isAcidic||might>20&&!hasForm||!hasForm&&isAcidic);
	}
	public static int getSlimeCount() {
		return slimeCount;
	}
	public static int getAcidCount() {
		return acidCount;
	}
	public static double percentAcid() {
		return 100*acidCount/slimeCount;
	}
}
