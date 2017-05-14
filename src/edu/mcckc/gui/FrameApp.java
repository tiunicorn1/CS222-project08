package edu.mcckc.gui;

import edu.mcckc.domain.TrigonometryManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rharris on 4/23/2017.
 */
public class FrameApp extends JFrame
{

    private PanelInput pnlInput;
    private PanelDisplay pnlDisplay;
    private TrigonometryManager trigManager;

    private JLabel lblImage;


    public FrameApp()
    {
        pnlInput = new PanelInput();
        pnlDisplay = new PanelDisplay();
        trigManager = new TrigonometryManager();

        lblImage = new JLabel(new ImageIcon("trig_info.png"));


        pnlInput.setPanelDisplayReference(pnlDisplay);
        pnlInput.setTrigonometryManagerReference(trigManager);
        pnlDisplay.setTrigonometryManagerReference(trigManager);


        add(pnlInput, BorderLayout.WEST);
        add(pnlDisplay, BorderLayout.EAST);
        add(lblImage, BorderLayout.CENTER);
    }

}
