package net.sourceforge.wekaclassalgos.neural.common.transfer;

/**
 * <p>
 * Title: Weka Neural Implementation
 * </p>
 * <p>
 * Description: ...
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company: N/A
 * </p>
 *
 * @author Jason Brownlee
 * @version 1.0
 */

public class SigmoidTransferFunction extends TransferFunction
{
    public final static double MAX = +1.0;
    public final static double MIN = 0.0;

    @Override
    public double transfer(double activation)
    {
        // y = 1 / (1 + exp (-1 * x))
        return (1.0 / (1.0 + Math.exp(-activation)));
    }

    @Override
    public double derivative(double activation, double transferred)
    {
        // y * (1 - y)
        return (transferred * (1.0 - transferred));
    }

    @Override
    public double getMaximum()
    {
        return MAX;
    }

    @Override
    public double getMinimum()
    {
        return MIN;
    }
}
