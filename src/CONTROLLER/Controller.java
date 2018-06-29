package CONTROLLER;

import MODEL.*;
import java.sql.SQLException;

public class Controller {
    //    Alunos
//    public static BEANPessoa buscaAluno(String nome) {
//        return DAOPessoa.getInstance().find(nome);
//    }

    public static void criaAluno(BEANAluno aluno) throws SQLException {
        DAOAluno.getInstance().create(aluno);
    }
    
    
    //


    public static void criaEquipe(BEANEquipe equipe, String nome) throws SQLException {
        DAOEquipe.getInstance().create(equipe, nome);
    }
}
