package homeEsercizi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il numero di parole da inserire: ");
		int numeroParole = in.nextInt();
		in.nextLine();
		String[] paroleInserite = new String[numeroParole];
		int index = 0;
		do {
			System.out.println("inserisci la parola N°" + (index + 1));
			String parola = in.nextLine();
			paroleInserite[index] = parola;
			index++;
		} while (index < paroleInserite.length);

		List<String> paroleDuplicate = new ArrayList<>();
		Set<String> unique = new HashSet<>();

		for (String s : paroleInserite) {

			if (!unique.add(s)) {
				paroleDuplicate.add(s);
			}
		}

		unique.forEach(d -> {
			if (paroleDuplicate.contains(d)) {
				paroleDuplicate.add(d);
			}
		});

		Iterator<String> i = unique.iterator();

		while (i.hasNext()) {
			String current = i.next();
			if (paroleDuplicate.contains(current)) {
				unique.remove(current);
			}

		}

		System.out.println("le parole duplicate sono: " + paroleDuplicate);
		System.out.println("il numero delle parole distinte sono: " + unique.size());
		System.out.println("le parole distinte sono: " + unique);

		in.close();
	}

}
