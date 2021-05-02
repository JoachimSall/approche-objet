package fr.diginamic.jdr;

public abstract class Creature {
	int force;
	int vie;
	
	public Creature() {
		setForce();
	}
	public int getForce() {
		return force;
	}
	
	public abstract void setForce();
	
	public int getVie() {
		return vie;
	}
	
	public abstract void setVie(int vie);
	
	public abstract String toString();
	
}
