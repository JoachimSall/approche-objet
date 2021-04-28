package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit cred1 = new Credit("21/04/2020", 450);
		Credit cred2 = new Credit("03/08/2021", 3850);
		Debit deb1 = new Debit("15/01/21", 1999.99);
		Debit deb2 = new Debit("30/03/21", 3.99);
		
		Operation[] tabOp = {cred1, cred2, deb1, deb2};
		
		int somme = 0;
		for(int i = 0; i < tabOp.length; i++) {
			System.out.println(tabOp[i].getType() + "\n" + tabOp[i].toString());
			if (tabOp[i].getType() == "DEBIT") { 
				tabOp[i].setMontant(- tabOp[i].getMontant());
			}
			somme += tabOp[i].getMontant(); 
		}
		System.out.println("montant global des opérations : " + somme);

	}

}
