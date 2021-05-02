package fr.diginamic.jdr;

public class Loup extends Creature {
	
	public Loup() {
		this.vie = (int) (5 + Math.random() * 6);
	}

	@Override
	public void setForce() {
		// TODO Auto-generated method stub
		this.force = (int) (3 + Math.random() * 6);
	}

	@Override
	public void setVie(int vie) {
		// TODO Auto-generated method stub
		this.vie = this.vie - vie;
	}
	
	@Override
	public String toString() {
		return "Le Loup == > | Force : " + getForce() + " | Vie : " + getVie();
	}
}
