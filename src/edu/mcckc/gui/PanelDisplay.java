package edu.mcckc.gui;

import edu.mcckc.domain.TrigonometryManager;

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
    }


    public PanelDisplay()
    {
    }


    public void calcTrigValues(double alphaAngle, double treeHeight, double treeDistance)
    {
    }


}
