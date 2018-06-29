package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DAOEventos {

    public DAOEventos() {
        MySQLDAO.getConnection();
    }
    
    private PreparedStatement state = null;
    private ResultSet rs = null;
    
    //vai fazer uma busca com o id o academico e vai retornar o nome dele
    public String buscarDados(int id) throws SQLException {
        state = MySQLDAO.getConnection().prepareStatement("select * from Academico where idAcademico = "+ Integer.toString(id));
        rs = state.executeQuery();
        String cod = "";
        while (rs.next()) {
            cod = rs.getString("nome");
        }
        return cod;
    }
    
    
}
