package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOPessoa {
private static DAOPessoa instance;

    public DAOPessoa() {
        MySQLDAO.getConnection();
    }

    public static DAOPessoa getInstance() {
        if (instance == null) {
            instance = new DAOPessoa();
        }
        return instance;
    }

//    public BEANPessoa find(String nome) {
//        BEANPessoa aluno = new BEANPessoa();
//        String query = "SELECT * from <tabela_dos_alunos> WHERE <coluna do Nome> = '" + nome + "'";
//        ResultSet rs = MySQLDAO.getResultSet(query);
//        try {
//            if (rs.next()) {
//                aluno.setId(rs.getInt("id"));
//                aluno.setNome(rs.getString("nome"));
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPessoa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return aluno;
//    }
//
//    public void create(BEANPessoa aluno) {
//        String query = "INSERT INTO <tabela_dos_alunos> (`Nome`) VALUES ('"  + aluno.getNome() + "')";
//        MySQLDAO.executeQuery(query);
//    }    
}
