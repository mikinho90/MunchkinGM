package MGM.backend;

public class Monster {
	
	private Integer power;
	private Integer loot;
	private Integer xp;

	public Monster() {
		resetMonster();
	}

	public Integer getPower() {
		return power;
	}

	public Integer getLoot() {
		return loot;
	}

	public Integer getXp() {
		return xp;
	}
	
	public void resetMonster(){
		this.power = 0;
		this.loot = 0;
		this.xp = 0;
	}	

}
