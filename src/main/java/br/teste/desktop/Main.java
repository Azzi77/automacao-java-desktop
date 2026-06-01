package br.teste.desktop;

import br.teste.desktop.factory.ConsultorioFactory;
import br.teste.desktop.flow.CadastroCompletoFlow;
import br.teste.desktop.model.Consultorio;

import java.awt.Robot;

public class Main {

    public static void main(String[] args) {

        try {

            Robot robot = new Robot();

            System.out.println("Iniciando automação...");

            robot.delay(7000);

            Consultorio consultorio =
                    ConsultorioFactory.criar();

            CadastroCompletoFlow flow =
                    new CadastroCompletoFlow(robot);

            flow.executar(consultorio);

            System.out.println("Fluxo finalizado.");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}