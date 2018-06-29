
package MODEL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


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
    public BEANDiretorEsportes getDiretor(String nome) throws SQLException {
        state = MySQLDAO.getConnection().prepareStatement("select * from diretorEventos where nome like ?");
        state.setString(1, nome);
        rs = state.executeQuery();
        
        BEANDiretorEsportes diretor = null;
        while (rs.next()) {
            diretor.setNomeCompleto(rs.getString("nome"));
            diretor.setSexo(rs.getString("sexo"));
            diretor.setDataNascimento(rs.getString("dataNascimento"));
            diretor.setCpf(rs.getString("cpf"));
            diretor.setEndereco(rs.getString("endereco"));
            diretor.setTelefone(rs.getString("telefone"));
            diretor.setNomeEsporte(rs.getString("tipoEsporte"));
        }
        return diretor;
    }
    
    
//    public List<BEANEventos> listEquipe() throws SQLException {
//        state = MySQLDAO.getConnection().prepareStatement("select * from Equipe");
//        rs = state.executeQuery();
//        
//    }
//    
    //inserindo a id do aluno e o nome da equipe no servidor
    public void create(BEANEquipe equipe, String nome) throws SQLException {
        //criando a query e separando os espaços de cada valor e depois inserindo eles cada um lugar certo
        state = MySQLDAO.getConnection().prepareStatement("insert  into equipe values (default, ?, ?)");
        state.setString(1, equipe.getNomeEquipe());
        state.setString(2, Integer.toString(DAOAluno.getInstance().getId(nome)));
        state.executeUpdate();
        MySQLDAO.terminar();
        
    }
}
