package tech.d4njan.composicao;

public class Endereco{

    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String rua, String cidade, String estado){
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    //Get set de rua
    public String getRua(){
        return rua;
    }
    public void setRua (String rua) {
        this.rua = rua;
    }

    //Get set de cidade
    public String getCidade (){
        return cidade;
    }
    public void setCidade (String cidade){
        this.cidade = cidade;
    }

    //Get set de estado
    public String getEstado (){
        return estado;
    }
    public void setEstado (String estado){
        this.estado = estado;
    }
}