package br.teste.desktop.page;

import br.teste.desktop.core.RobotUtils;
import br.teste.desktop.model.Consultorio;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ConsultorioPage extends BasePage {

    public ConsultorioPage(Robot robot) {

        super(robot);
    }

    public void preencher(Consultorio consultorio) {

        System.out.println("Preenchendo aba consultório...");

        RobotUtils.digitar(robot, consultorio.getNome());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getCro());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getTelefone());
        RobotUtils.tab(robot);

        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getWhatsapp());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getEmail());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getCep());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getRua());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getBairro());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getCidade());
        RobotUtils.tab(robot);

        RobotUtils.digitar(robot, consultorio.getEstado());
        RobotUtils.tab(robot);

        RobotUtils.tab(robot);

        robot.delay(500);

        RobotUtils.setaBaixo(robot, 4);

        RobotUtils.tab(robot);
        RobotUtils.tab(robot);
        RobotUtils.tab(robot);
        RobotUtils.tab(robot);

        avancarProximaAba();
    }

    private void avancarProximaAba() {

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_RIGHT);

        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(500);

        System.out.println("Avançou para próxima aba.");
    }
}