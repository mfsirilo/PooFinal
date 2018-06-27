
package MODEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cursos {
    
    private int idCurso;
    private String Nome;
    
    public Cursos(int idCurso, String Nome){
        this.Nome = Nome;
        this.idCurso = idCurso;
    }
    
    private static Cursos instance;

    public Cursos() {
        MySQLDAO.getConnection();
    }

    public static Cursos getInstance() {
        if (instance == null) {
            instance = new Cursos();
        }
        return instance;
    }

    public ArrayList<Cursos> findlistCurso() {
        return list("SELECT * FROM `Cursos`");
    }

    public ArrayList<Cursos> findlistCurso(int id) {
        return list("SELECT * FROM `Cursos` WHERE `idCurso` = " + id + " ORDER BY `idCurso` ASC ");
    }

    private ArrayList<Cursos> list(String query) {
        ArrayList<Cursos> list = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                list.add(new Cursos(rs.getInt("idCurso"), rs.getString("Nome")));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
