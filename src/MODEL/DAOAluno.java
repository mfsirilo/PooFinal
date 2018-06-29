package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOAluno {

    public DAOAluno() {
        MySQLDAO.getConnection();
    }
    private static DAOAluno instance = null;
    public static DAOAluno getInstance(){
        if(instance == null) instance = new DAOAluno();
        return instance;
    }
    
    public int getId(String nome) throws SQLException {
        state = MySQLDAO.getConnection().prepareStatement("select * from Academico where nome like ?");
        state.setString(1, nome);
        rs = state.executeQuery();
        
        int cod = 0;
        while (rs.next()) {
            cod = rs.getInt("idAcademico");
        }
        return cod;
    }
    
    private PreparedStatement state = null;
    private ResultSet rs = null;
    public void create(BEANAluno aluno) throws SQLException {
        //criando a query e separando os espaços de cada valor e depois inserindo eles cada um lugar certo
        state = MySQLDAO.getConnection().prepareStatement("insert into Academico values (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        state.setString(1, aluno.getNomeCompleto());
        state.setString(2, aluno.getSexo());
        state.setString(3, aluno.getDataNascimento());
        state.setString(4, aluno.getCpf());
        state.setString(5, aluno.getEndereco());
        state.setString(6, aluno.getTelefone());
        state.setString(7, aluno.getCurso());
        state.setString(8, aluno.getPeriodo());
        state.setString(9, aluno.getConclusao());
        state.setString(10, aluno.getEsporte());
        state.executeUpdate();
        MySQLDAO.terminar();
    }
}
