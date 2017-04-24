package edu.mcckc.gui;

import edu.mcckc.domain.TrigonometryManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rharris on 4/23/2017.
 */
public class PanelInput extends JPanel implements ActionListener
{
    private PanelDisplay pnlDisplay;
    private TrigonometryManager trigManager;

    private JDataEntry datTreeHeight;
    private JDataEntry datTreeDistance;
    private JDataEntry datAngleAlpha;
    private JButton btnCalc;


    public void setTrigonometryManagerReference(TrigonometryManager trigManager)
    {
    }

    public void setPanelDisplayReference(PanelDisplay pnlDisplay)
    {
    }


    public PanelInput()
    {
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
        }
        catch (Exception ex)
        {
        }
    }
}
