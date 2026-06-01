package br.teste.desktop.page;

import java.awt.Robot;

public abstract class BasePage {

    protected Robot robot;

    public BasePage(Robot robot) {

        this.robot = robot;
    }
}