package MODEL;
import java.util.Date;


public abstract class Pessoa {
    String nomeCompleto;
    char sexo;
    int cpf;
    String endereco;
    int telefone;

    /*Construtor padrão da classe abstrata*/
    public Pessoa (String nome, char sexo,int cpf,String endereco,int telefone){
        nome=this.nomeCompleto;
        sexo=this.sexo;
        cpf=this.cpf;
        endereco =this.endereco;
        telefone=this.telefone;
    }
    private void fechar(){
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","ATENÇÂO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){
            this.dispose();
        }
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
