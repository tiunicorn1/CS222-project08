package edu.mcckc.domain;

/**
 * Created by rharris on 4/23/2017.
 */
public class TrigonometryManager
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


        360  DEG   =   2 * PI radians
        180  DEG   =   PI radians
     */



    private double treeHeight;
    private double treeDistance;
    private double alphaAngle;


    public TrigonometryManager()
    {

    }


    public double getTreeHeight() {
        return treeHeight;
    }

    public double getTreeDistance() {
        return treeDistance;
    }

    public double getAlphaAngle() {
        return alphaAngle;
    }

    public void calcTrigValues(double alphaAngle, double treeHeight, double treeDistance)
    {

    }
}
