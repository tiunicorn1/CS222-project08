package edu.mcckc.gui;

import edu.mcckc.domain.TrigonometryManager;
import org.apache.log4j.Logger;

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
        this.trigManager = trigManager;
    }

    public void setPanelDisplayReference(PanelDisplay pnlDisplay)
    {
        this.pnlDisplay = pnlDisplay;
    }


    public PanelInput()
    {
        datTreeHeight = new JDataEntry("Tree Height: ", 10, "0");
        datTreeDistance = new JDataEntry("Tree Distance: ", 10, "0");
        datAngleAlpha = new JDataEntry("Angle Alpha: ", 10, "0");
        btnCalc = new JButton("Calc");

        btnCalc.setActionCommand("add");
        btnCalc.addActionListener(this);

        setLayout(new GridLayout(4, 2));
        add(datTreeHeight);
        add(datTreeDistance);
        add(datAngleAlpha);

        add(btnCalc);


    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            trigManager.calcTrigValues(datAngleAlpha.getDouble(), datTreeHeight.getDouble(), datTreeDistance.getDouble() );
            pnlDisplay.calcTrigValues(datAngleAlpha.getDouble(), datTreeHeight.getDouble(), datTreeDistance.getDouble());
        }
        catch (Exception ex)
        {
            Logger.getLogger(this.getClass()).debug(ex.toString());
        }
    }
}
