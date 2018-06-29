package MODEL;

public class BEANDiretorEsportes extends BEANPessoa {
    private String nomeEsporte;

    public String getNomeEsporte() {
        return nomeEsporte;
    }

    public void setNomeEsporte(String nomeEsorte) {
        this.nomeEsporte = nomeEsorte;
    }

    public BEANDiretorEsportes(String nomeEsporte, String nomeCompleto, String sexo, String dataNascimento, String cpf, String endereco, String telefone) {
        super(nomeCompleto, sexo, dataNascimento, cpf, endereco, telefone);
        this.nomeEsporte = nomeEsporte;
    }
}
