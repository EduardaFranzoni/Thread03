package view;

import java.util.Random;

import controller.ThreadCalc;

public class Main {
	public static void main(String[] args) {
		int [][] matriz = new int [3][5];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = random.nextInt(100);
			}
		}
		for(int i = 0; i < 3; i++) {
			int [] vet = matriz[i];
			Thread t = new ThreadCalc(vet, i);
			t.start();
		}
	}
}
