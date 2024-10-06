package tech.d4njan.composicao;

import java.util.Scanner;

public class Telefone {

	private int ddd;
	private String numero;

	Scanner sc2 = new Scanner(System.in);

    // Gets e Sets

        public int getDdd() {
            return ddd;
        }
        public void setDdd(int ddd) {
            this.ddd = ddd;
        }
        public String getNumero() {
            return numero;
        }
        public void setNumero(String numero) {
            this.numero = numero;
        }

	public void cadastrar() {

		System.out.print("Informe o DDD: ");
		this.ddd = sc2.nextInt();

		System.out.print("Informe o numero: ");
		this.numero = sc2.nextLine();

	}

}
