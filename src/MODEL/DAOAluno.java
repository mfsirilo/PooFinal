package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOAluno {
private static DAOAluno instance;

    public DAOAluno() {
        MySQLDAO.getConnection();
    }

    public static DAOAluno getInstance() {
        if (instance == null) {
            instance = new DAOAluno();
        }
        return instance;
    }

    public BEANAluno find(String nome) {
        BEANAluno aluno = new BEANAluno();
        String query = "SELECT * from <tabela_dos_alunos> WHERE <coluna do Nome> = '" + nome + "'";
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            if (rs.next()) {
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

        return aluno;
    }

    public void create(BEANAluno aluno) {
        String query = "INSERT INTO <tabela_dos_alunos> (`nome`) VALUES ('"  + aluno.getNome() + "')";
        MySQLDAO.executeQuery(query);
    }    
}
