package CONTROLLER;

import MODEL.BEANAluno;
import MODEL.DAOAluno;

public class Controller {
    //    Alunos
    public static BEANAluno buscaAluno(String nome) {
        return DAOAluno.getInstance().find(nome);
    }

    public static void addUsuario(BEANAluno aluno) {
        DAOAluno.getInstance().create(aluno);
    }
}
