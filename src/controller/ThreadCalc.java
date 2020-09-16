package controller;

public class ThreadCalc extends Thread{
	private int [] vet;
	private int index;
	public ThreadCalc(int [] vet, int index) {
		this.vet = vet;
		this.index = index;
	}
	
	@Override
	public void run() {
		calc();
	}
	
	private void calc() {
		int soma = 0;
		for(int var : vet) {
			soma += var;
		}
		System.out.println("A linha " + this.index + " deu a soma igual a " + soma);
	}
}
