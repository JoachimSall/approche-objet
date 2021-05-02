package fr.diginamic.jdr;

public class Gobelin extends Creature {
	
	public Gobelin() {
		this.vie = (int) (10 + Math.random() * 6);
	}
	@Override
	public void setForce() {
		// TODO Auto-generated method stub
		this.force = (int) (5 + Math.random() * 6);
	}

	@Override
	public void setVie(int vie) {
		// TODO Auto-generated method stub
		this.vie = this.vie - vie;
	}
	
	@Override
	public String toString() {
		return "Le Gobelin == > | Force : " + getForce() + " | Vie : " + getVie();
	}

}
