package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



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
    
    private static DAOEventos instance = null;
    public static DAOEventos getInstance(){
        if(instance == null) instance = new DAOEventos();
        return instance;
    }
    
    public List<BEANEventos> getEventos() throws SQLException {
        state = MySQLDAO.getConnection().prepareStatement("select * from Eventos");
        rs = state.executeQuery();
        List<BEANEventos> eventos = null;
        while (rs.next()) {
            BEANEventos evento = new BEANEventos();
            evento.setDiretor(rs.getInt("diretorEsporte_iddiretorEsporte"));
            evento.setEquipe(rs.getInt("idEquipe"));
            evento.setData(rs.getDate("Data_evento"));
            eventos.add(evento);
        }
        return eventos;
    }
    
    
}
