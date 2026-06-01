package br.teste.desktop.flow;


import br.teste.desktop.model.Consultorio;
import br.teste.desktop.page.ConsultorioPage;

import java.awt.Robot;

public class CadastroCompletoFlow {

    private Robot robot;

    public CadastroCompletoFlow(Robot robot) {

        this.robot = robot;
    }

    public void executar(Consultorio consultorio) {

        ConsultorioPage consultorioPage =
                new ConsultorioPage(robot);

        consultorioPage.preencher(consultorio);
    }
}