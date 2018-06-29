package MODEL;

public class BEANEquipe {
   String nomeEquipe;
   int idAcademico;

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public int getIdAcademico() {
        return idAcademico;
    }

    public void setIdAcademico(int idAcademico) {
        this.idAcademico = idAcademico;
    }

    public BEANEquipe(String nomeEquipe, int idAcademico) {
        this.nomeEquipe = nomeEquipe;
        this.idAcademico = idAcademico;
    }
}
