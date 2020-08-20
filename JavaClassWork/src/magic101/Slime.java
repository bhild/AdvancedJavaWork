package magic101;

public class Slime extends Enemy{
	//vars
	//
	private boolean hasForm;
	private boolean isAcidic;
	//constructors m
	public Slime() {
		super();
		setHasForm(true);
		setAcidic(false);
	}
	public Slime(String name,int might,boolean isHostile) {
		this.name=name;
		this.might = might;
		this.isHostile = isHostile;

	}public Slime(String name,int might,boolean isHostile,boolean hasForm,boolean isAcidic) {
		this.name=name;
		this.might = might;
		this.isHostile = isHostile;
		this.setHasForm(hasForm);
		this.setAcidic(isAcidic);

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
}
