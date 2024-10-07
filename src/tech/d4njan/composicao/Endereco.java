package tech.d4njan.composicao;

import java.util.Scanner;

public class Endereco{

    private String rua;
    private String numero;
	private String cep;
	private String cidade;
	private String estado;
	private String pais;
    
    public Endereco(String rua, String numero, String cep, String cidade, String estado, String pais){

        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;

    }

    Scanner sc1 = new Scanner(System.in);

    // Gets e Sets

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

    public void cadastrar() {

            System.out.print("Informe a rua: ");
            this.rua = sc1.nextLine();

            System.out.print("Informe o numero da rua: ");
            this.numero = sc1.nextLine();

            System.out.print("Informe o CEP: ");
            this.cep = sc1.nextLine();

            System.out.print("Informe a cidade: ");
            this.cidade = sc1.nextLine();

            System.out.print("Informe o estado: ");
            this.estado = sc1.nextLine();

            System.out.print("Informe o pais: ");
            this.pais = sc1.nextLine();

    }

}
