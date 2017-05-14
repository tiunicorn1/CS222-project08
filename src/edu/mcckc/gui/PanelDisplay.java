package edu.mcckc.gui;

import edu.mcckc.domain.TrigonometryManager;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rharris on 4/23/2017.
 */
public class PanelDisplay extends JPanel
{
    /*
                                     /
                                 /    |
                              /       |
                 hyp      /           |   opp
                       /              |
                   /                _ |
               /                   |  |
    alpha     _________________________
                         adj

        sin(alpha) =  opp / hyp
        cos(alpha) =  adj / hyp
        tan(alpha) =  opp / adj
     */

    private JLabel lblTreeHeight;
    private JLabel lblTreeDistance;
    private JLabel lblAngleAlpha;

    private JLabel lblTreeHeightValue;
    private JLabel lblTreeDistanceValue;
    private JLabel lblAngleAlphaValue;


    private TrigonometryManager trigManager;


    public void setTrigonometryManagerReference(TrigonometryManager trigManager)
    {
        this.trigManager = trigManager;
    }


    public PanelDisplay()
    {
        lblTreeHeight = new JLabel("Tree Height: ");
        lblTreeDistance = new JLabel("Tree Distance: ");
        lblAngleAlpha = new JLabel("Angle Alpha: ");

        lblTreeHeightValue = new JLabel("");
        lblTreeDistanceValue = new JLabel("");
        lblAngleAlphaValue = new JLabel("");

        setLayout(new GridLayout(3, 2));
        add(lblTreeHeight);
        add(lblTreeHeightValue);
        add(lblTreeDistance);
        add(lblTreeDistanceValue);
        add(lblAngleAlpha);
        add(lblAngleAlphaValue);


    }


    public void calcTrigValues(double alphaAngle, double treeHeight, double treeDistance)
    {
        Logger.getLogger(PanelDisplay.class.getName()).debug("Inside calcTrigValues");

        trigManager.calcTrigValues(alphaAngle, treeHeight, treeDistance);

        Logger.getLogger(PanelDisplay.class.getName()).debug("getTreeHeight: " + trigManager.getTreeHeight());
        Logger.getLogger(PanelDisplay.class.getName()).debug("getTreeDistance: " +  trigManager.getTreeDistance());
        Logger.getLogger(PanelDisplay.class.getName()).debug("getAlphaAngle: " + trigManager.getAlphaAngle());


        lblTreeHeightValue.setText(trigManager.getTreeHeightString());
        lblTreeDistanceValue.setText(trigManager.getTreeDistanceString());
        lblAngleAlphaValue.setText(trigManager.getAlphaAngleString());

        Logger.getLogger(PanelDisplay.class.getName()).debug("getTreeHeightString: " + trigManager.getTreeHeightString());
        Logger.getLogger(PanelDisplay.class.getName()).debug("getTreeDistanceString: " +  trigManager.getTreeDistanceString());
        Logger.getLogger(PanelDisplay.class.getName()).debug("getAlphaAngleString: " + trigManager.getAlphaAngleString());


    }


}
