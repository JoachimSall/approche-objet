package fr.diginamic.jdr;

public class Personnage {
	
	private int force;
	private int vie;
	private int score = 0;
	
	public Personnage() {
		setForce();
		this.vie = (int) (20 + Math.random() * 31);
	}
	
	public String toString() {
		return "Vous ==> Force : " + getForce() + " | Vie : " + getVie() + " | Score : " + getScore();
		
	}
	public int getForce() {
		return force;
	}
	public void setForce() {
		this.force = (int) (12 + Math.random() * 7);
	}
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = this.vie - vie;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = this.score + score;
	}
}
