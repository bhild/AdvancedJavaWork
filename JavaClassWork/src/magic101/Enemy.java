package magic101;

public abstract class Enemy {
	protected String name;
	protected int might;
	protected boolean isHostile;
	public Enemy() {
		this.name=null;
		this.might = 0;
		this.isHostile = true;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getMight() {
		return might;
	}
	protected void setMight(int might) {
		this.might = might;
	}
	protected boolean isHostile() {
		return isHostile;
	}
	protected void setHostile(boolean isHostile) {
		this.isHostile = isHostile;
	}
	@Override
	public String toString() {
		return "name: "+name+"\nmight: "+might+"\nisHostile: "+ isHostile;
	}
}
