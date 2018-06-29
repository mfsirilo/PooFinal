package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAODiretorEsportes {
    public DAODiretorEsportes() {
        MySQLDAO.getConnection();
    }
    
    private static DAODiretorEsportes instance = null;
    public static DAODiretorEsportes getInstance(){
        if(instance == null) instance = new DAODiretorEsportes();
        return instance;
    }
    
    private PreparedStatement state = null;
    private ResultSet rs = null;
    public void create(BEANDiretorEsportes diretor) throws SQLException {
        //criando a query e separando os espaços de cada valor e depois inserindo eles cada um lugar certo
        state = MySQLDAO.getConnection().prepareStatement("insert  into diretorEsporte values (default, ?, ?, ?, ?, ?, ?, ?)");
        state.setString(1, diretor.getNomeCompleto());
        state.setString(2, diretor.getSexo());
        state.setString(3, diretor.getDataNascimento());
        state.setString(4, diretor.getCpf());
        state.setString(5, diretor.getEndereco());
        state.setString(6, diretor.getTelefone());
        state.setString(7, diretor.getNomeEsporte());
        state.executeUpdate();
        MySQLDAO.terminar();
        
    }
}
