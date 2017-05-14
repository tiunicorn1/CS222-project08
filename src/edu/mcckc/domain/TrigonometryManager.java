package edu.mcckc.domain;

import org.apache.log4j.Logger;

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
        treeHeight = 0.0;
        treeDistance = 0.0;
        alphaAngle = 0.0;

    }


    public double getTreeHeight()
    {
        return treeHeight;
    }

    public double getTreeDistance() {
        return treeDistance;
    }

    public double getAlphaAngle() {
        return alphaAngle;
    }

    public void setTreeHeight(double treeHeight)
    {
        this.treeHeight = treeHeight;
    }

    public void setTreeDistance(double treeDistance)
    {
        this.treeDistance = treeDistance;
    }

    public void setAlphaAngle(double alphaAngle)
    {
        this.alphaAngle = alphaAngle;
    }

    public void calcTrigValues(double alphaAngle, double treeHeight, double treeDistance) {
        Logger.getLogger(TrigonometryManager.class.getName()).debug("Inside calcTrigValues");

        if (treeDistance == 0)
        {
            Logger.getLogger(TrigonometryManager.class.getName()).debug("alphaAngle: " + alphaAngle);
            Logger.getLogger(TrigonometryManager.class.getName()).debug("treeHeight: " + treeHeight);
            setTreeHeight(treeHeight);
            setAlphaAngle(alphaAngle);
            setTreeDistance(Math.tan(Math.toRadians(alphaAngle)) * treeHeight);
            Math.toDegrees(alphaAngle);

            Logger.getLogger(TrigonometryManager.class.getName()).debug("getTreeDistance: " + getTreeDistance());
            Logger.getLogger(TrigonometryManager.class.getName()).debug("getAlphaAngle: " + getAlphaAngle());

        } else if (treeHeight == 0)
        {
            Logger.getLogger(TrigonometryManager.class.getName()).debug("alphaAngle: " + alphaAngle);
            Logger.getLogger(TrigonometryManager.class.getName()).debug("treeDistance: " + treeDistance);
            setTreeDistance(treeDistance);
            setAlphaAngle(alphaAngle);
            setTreeHeight(Math.tan(Math.toRadians(alphaAngle)) * treeDistance);
            Math.toDegrees(alphaAngle);
            Logger.getLogger(TrigonometryManager.class.getName()).debug("getTreeHeight: " + getTreeHeight());
            Logger.getLogger(TrigonometryManager.class.getName()).debug("getAlphaAngle: " + getAlphaAngle());

        } else if (alphaAngle == 0)
        {
            Logger.getLogger(TrigonometryManager.class.getName()).debug("treeHeight: " + treeHeight);
            Logger.getLogger(TrigonometryManager.class.getName()).debug("treeDistance: " + treeDistance);
            setTreeHeight(treeHeight);
            setTreeDistance(treeDistance);
            setAlphaAngle(Math.toDegrees(Math.atan(treeHeight / treeDistance)));
            //Math.toDegrees(alphaAngle);
            Logger.getLogger(TrigonometryManager.class.getName()).debug("getAlphaAngle: " + getAlphaAngle());
        }
    }

        public String getTreeHeightString()
        {
            return (String.format(" %.2f", treeHeight));

        }
    public String getTreeDistanceString()
    {
        return (String.format(" %.2f", treeDistance));
    }
    public String getAlphaAngleString()
    {
        return (String.format(" %.2f", alphaAngle));
    }



}
