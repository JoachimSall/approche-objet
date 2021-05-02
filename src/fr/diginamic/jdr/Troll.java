package fr.diginamic.jdr;

public class Troll extends Creature {
	
	public Troll() {
		this.vie = (int) (20 + Math.random() * 11);
	}
	
	@Override
	public void setForce() {
		// TODO Auto-generated method stub
		this.force = (int) (10 + Math.random() * 6);
	}

	@Override
	public void setVie(int vie) {
		// TODO Auto-generated method stub
		this.vie = this.vie - vie;
	}
	
	@Override
	public String toString() {
		return "Le Troll == > | Force : " + getForce() + " | Vie : " + getVie();
	}
}
