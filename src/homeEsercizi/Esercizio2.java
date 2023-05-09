package homeEsercizi;

import java.util.ArrayList;
import java.util.List;

public class Esercizio2 {

	public static void main(String[] args) {
		System.out.println(ArrayNumer(5));
		System.out.println(ArrayInverso(ArrayNumer(5)));
		pariDispari(ArrayInverso(ArrayNumer(5)), false);
	}

	public static List<Integer> ArrayNumer(int lunghezza) {
		List<Integer> array = new ArrayList<>();
		for (int i = 0; i < lunghezza; i++) {
			array.add((int) (Math.random() * 101));
		}
		return array;
	}

	public static List<Integer> ArrayInverso(List<Integer> arrayPrecedente) {
		List<Integer> array = new ArrayList<>();
		for (int i = 0; i < arrayPrecedente.size(); i++) {
			array.add(arrayPrecedente.get(i));
		}

		for (int i = arrayPrecedente.size() - 1; i >= 0; i--) {
			array.add(arrayPrecedente.get(i));

		}
		return array;
	}

	public static void pariDispari(List<Integer> array, boolean tf) {
		List<Integer> newArray = new ArrayList<>();
		if (tf) {
			for (int i = 0; i < array.size(); i++) {
				if (i % 2 == 0) {
					newArray.add(array.get(i));
				}
			}
		} else {
			for (int i = 0; i < array.size(); i++) {
				if (i % 2 != 0) {
					newArray.add(array.get(i));
				}
			}
		}
		System.out.println("array precedente: " + array);
		System.out.println("array filtrato: " + newArray);
	}
}
