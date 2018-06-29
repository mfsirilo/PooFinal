package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOPessoa {
    public DAOPessoa() {
        MySQLDAO.getConnection();
    }

    private static DAOPessoa instance;
    public static DAOPessoa getInstance() {
        if (instance == null) {
            instance = new DAOPessoa();
        }
        return instance;
    }
    
//    public BEANPessoa find(String nome) {
//        BEANPessoa aluno = null;
//        String query = "SELECT * from <academico> WHERE <Nome> = '" + nome + "'";
//        ResultSet rs = MySQLDAO.getResultSet(query);
//        try {
//            if (rs.next()) {
//                //BEANPessoa.setId(rs.getInt("id"));
//                aluno.setNome(rs.getString("nome"));
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOPessoa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return aluno;
//    }

    
    
    public void createAcademico(){
        
    }
}
