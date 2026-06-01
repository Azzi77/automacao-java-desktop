package br.teste.desktop.core;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotUtils {

    public static void digitar(Robot robot, String texto) {

        texto = texto.toUpperCase();

        for (char c : texto.toCharArray()) {

            try {

                if (c == '@') {

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_2);

                    robot.keyRelease(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                } else if (c == ' ') {

                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.keyRelease(KeyEvent.VK_SPACE);

                } else {

                    int keyCode =
                            KeyEvent.getExtendedKeyCodeForChar(c);

                    robot.keyPress(keyCode);
                    robot.keyRelease(keyCode);
                }

                robot.delay(50);

            } catch (Exception e) {

                System.out.println("Erro ao digitar: " + c);
            }
        }

        robot.delay(200);
    }

    public static void tab(Robot robot) {

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.delay(300);
    }

    public static void setaBaixo(
            Robot robot,
            int vezes
    ) {

        for (int i = 0; i < vezes; i++) {

            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);

            robot.delay(300);
        }
    }
}