package CONTROLLER;

import MODEL.*;

public class Controller {
    //    Alunos
//    public static BEANPessoa buscaAluno(String nome) {
//        return DAOPessoa.getInstance().find(nome);
//    }

    public static void criaAluno(BEANAluno aluno) {
        DAOPessoa.getInstance().create(aluno);
    }
    
    
    //


    public static void criaEquipe(BEANEquipe equipe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
