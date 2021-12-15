
import java.util.Scanner;

public class JogoTeste {

	public static void main(String[] args) {

		System.out.println("Voc� est� em uma casa no meio da floresta...");
		System.out.println("Escolha uma dire��o (w, d, s, a):");

		Scanner scan = new Scanner(System.in);

		String op;

		do {

			op = scan.nextLine();

			if (op.equals("w")) {
				System.out.println("Parede! Voc� bateu a cabe�a e morreu!");
			} else if (op.equals("d")) {
				System.out.println("Lobos selvagens! Voc� foi devorado!");
			} else if (op.equals("s")) {
				System.out.println("Cuidado, monstro! Voc� foi esmagado!");
			} else if (op.equals("a")) {
				System.out.println("Voc� encontrou a sa�da! Par�bens!");
			}

		} while (!op.equals("a")); // enquanto op n�o � igual a "a".

		scan.close();
	}

}
