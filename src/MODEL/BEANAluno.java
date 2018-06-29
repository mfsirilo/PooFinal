package MODEL;

public class BEANAluno extends BEANPessoa{
    private String curso;
    private int periodo;
    private String conclusao;
    private String esporte;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public BEANAluno(String curso, int periodo, String conclusao, String esporte, String nomeCompleto, String sexo, String dataNascimento, String cpf, String endereco, String telefone) {
        super(nomeCompleto, sexo, dataNascimento, cpf, endereco, telefone);
        this.curso = curso;
        this.periodo = periodo;
        this.conclusao = conclusao;
        this.esporte = esporte;
    }
}