package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		Champion champ1 = new Champion(name, life, attack, armor);
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String name2 = sc.next();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		
		Champion champ2 = new Champion(name2, life2, attack2, armor2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			champ1.takeDamage(champ2.getAttack());
			champ2.takeDamage(champ1.getAttack());
			System.out.print("Resultado do turno " + (i+1));
			System.out.println();
            System.out.println(champ1.status());
            System.out.println(champ2.status());
            System.out.println();
            if(champ1.getLife() == 0 || champ2.getLife() == 0) {
            	break;
            }
		}
		System.out.println("FIM DO COMBATE");
	}
}