package edu.mcckc.driver;

import edu.mcckc.gui.FrameApp;
import org.apache.log4j.Logger;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Logger.getLogger(Main.class.getName()).debug("Inside Main Method");

        FrameApp frmApp = new FrameApp();
        frmApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmApp.setSize(1000, 500);
        frmApp.setVisible(true);
    }
}
