
package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAOEquipe {
    public DAOEquipe() {
        MySQLDAO.getConnection();
    }
    private static DAOEquipe instance = null;
    public static DAOEquipe getInstance(){
        if(instance == null) instance = new DAOEquipe();
        return instance;
    }
    
    private PreparedStatement state = null;
    private ResultSet rs = null;
    
    
    //pega o id do aluno
    public int getId(String nome) throws SQLException {
        state = MySQLDAO.getConnection().prepareStatement("select * from Academico where nome like "+nome);
        rs = state.executeQuery();
        int cod = 0;
        while (rs.next()) {
            cod = rs.getInt("idAcademico");
        }
        return cod;
    }
    //inserindo a id do aluno e o nome da equipe no servidor
    public void create(BEANEquipe equipe, String nome) throws SQLException {
        //criando a query e separando os espaços de cada valor e depois inserindo eles cada um lugar certo
        state = MySQLDAO.getConnection().prepareStatement("insert  into equipe values (default, ?, ?)");
        state.setString(1, equipe.getNomeEquipe());
        state.setString(2, Integer.toString(getId(nome)));
        state.executeUpdate();
        MySQLDAO.terminar();
        
    }
}
