package fr.diginamic.jdr;

import java.util.Scanner;

public class JeuDeRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean persoVivant = false;
		
		while (persoVivant == false) {
			System.out.println("Appuyez sur entrée pour créer votre personnage");
			if (scanner.nextLine().equals("")) {
				Personnage p1 = new Personnage();
				System.out.println(p1.toString());
				persoVivant = true;
				while (persoVivant == true) {
					p1.toString();
					System.out.println("Appuyez sur entrée pour affronter une créature");
					if (scanner.nextLine().equals("")) {
						int creature = (int) (Math.random() * 3);
						switch(creature){
							case 0 :
								System.out.println("Vous affrontez un loup ! Appuyez sur entrée pour combattre !");
								Loup loup = new Loup();
								System.out.println(loup.toString());
								while(loup.getVie() > 0 && p1.getVie() > 0) {
									if (scanner.nextLine().equals("")) {
										int attaquePerso = p1.getForce() + (int) (1 + Math.random() * 10);
										int attaqueCrea = loup.getForce() + (int) (1 + Math.random() * 10);
										if (attaquePerso >= attaqueCrea) {
											loup.setVie(attaquePerso - attaqueCrea);
											if (loup.getVie() > 0) {
												System.out.println("Vous avez infligé " + (attaquePerso - attaqueCrea) + " de dommages au Loup ! Continuez en appuyant sur entrée !");
												System.out.println(loup.toString());
											} else {
												System.out.println("Vous infligez " + (attaquePerso - attaqueCrea) +  " de dommages et vous finissez le Loup !");
											}
										} else {
											p1.setVie(attaqueCrea - attaquePerso);
											if (p1.getVie() > 0) {
												System.out.println("Le loup vous a infligé " + (attaqueCrea - attaquePerso) + " de dommages ! Vengez-vous en appuyant sur entrée !");
												System.out.println(p1.toString());
											} else {
												System.out.println("Le loup vous inflige " + (attaqueCrea - attaquePerso) + " de dommages et il vous finit !");
											}
										}
									}; 
								}
								if (loup.getVie() <= 0) {
									p1.setScore(1);
									System.out.println("Vous avez gagnez !");
									System.out.println(p1.toString());
								} else if (p1.getVie() <= 0) {
									System.out.println("Vous avez perdu ! Votre score : " + p1.getScore());
									persoVivant = false;
								}
								break;
							case 1:
								System.out.println("Vous affrontez un gobelin ! Appuyez sur entrée pour combattre !");
								Gobelin gobelin = new Gobelin();
								System.out.println(gobelin.toString());
								while(gobelin.getVie() > 0 && p1.getVie() > 0) {
									if (scanner.nextLine().equals("")) {
										int attaquePerso = p1.getForce() + (int) (1 + Math.random() * 10);
										int attaqueCrea = gobelin.getForce() + (int) (1 + Math.random() * 10);
										if (attaquePerso >= attaqueCrea) {
											gobelin.setVie(attaquePerso - attaqueCrea);
											if (gobelin.getVie() > 0) {
												System.out.println("Vous avez infligé " + (attaquePerso - attaqueCrea) + " de dommages au gobelin ! Continuez en appuyant sur entrée !");
												System.out.println(gobelin.toString());
											} else {
												System.out.println("Vous infligez " + (attaquePerso - attaqueCrea) +  " de dommages et vous finissez le gobelin !");
											}
										} else {
											p1.setVie(attaqueCrea - attaquePerso);
											if (p1.getVie() > 0) {
												System.out.println("Le gobelin vous a infligé " + (attaqueCrea - attaquePerso) + " de dommages ! Vengez-vous en appuyant sur entrée !");
												System.out.println(p1.toString());
											} else {
												System.out.println("Le gobelin vous inflige " + (attaqueCrea - attaquePerso) + " de dommages et il vous finit !");
											}
										}
									}; 
								}
								if (gobelin.getVie() <= 0) {
									p1.setScore(2);
									System.out.println("Vous avez gagnez !");
									System.out.println(p1.toString());
								} else if (p1.getVie() <= 0) {
									System.out.println("Vous avez perdu ! Votre score : " + p1.getScore());
									persoVivant = false;
								}
								break;
							case 2:
								System.out.println("Vous affrontez un troll ! Appuyez sur entrée pour combattre !");
								Troll troll = new Troll();
								System.out.println(troll.toString());
								while(troll.getVie() > 0 && p1.getVie() > 0) {
									if (scanner.nextLine().equals("")) {
										int attaquePerso = p1.getForce() + (int) (1 + Math.random() * 10);
										int attaqueCrea = troll.getForce() + (int) (1 + Math.random() * 10);
										if (attaquePerso >= attaqueCrea) {
											troll.setVie(attaquePerso - attaqueCrea);
											if (troll.getVie() > 0) {
												System.out.println("Vous avez infligé " + (attaquePerso - attaqueCrea) + " de dommages au troll ! Continuez en appuyant sur entrée !");
												System.out.println(troll.toString());
											} else {
												System.out.println("Vous infligez " + (attaquePerso - attaqueCrea) +  " de dommages et vous finissez le troll !");
											}
										} else {
											p1.setVie(attaqueCrea - attaquePerso);
											if (p1.getVie() > 0) {
												System.out.println("Le troll vous a infligé " + (attaqueCrea - attaquePerso) + " de dommages ! Vengez-vous en appuyant sur entrée !");
												System.out.println(p1.toString());
											} else {
												System.out.println("Le troll vous inflige " + (attaqueCrea - attaquePerso) + " de dommages et il vous finit !");
											}
										}
									}; 
								}
								if (troll.getVie() <= 0) {
									p1.setScore(5);
									System.out.println("Vous avez gagnez !");
									System.out.println(p1.toString());
								} else if (p1.getVie() <= 0) {
									System.out.println("Vous avez perdu ! Votre score : " + p1.getScore());
									persoVivant = false;
								}
								break;
						}
					}
				}
			}
		}
		
	}

}

