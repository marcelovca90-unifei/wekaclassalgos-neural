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

public class GaussianTransferFunction extends TransferFunction
{
    public final static double MAX = +1.0;
    public final static double MIN = 0.0;

    @Override
    public double transfer(double activation)
    {
        // y = exp(- x * x)
        return Math.exp(-activation * activation);
    }

    @Override
    public double derivative(double activation, double transferred)
    {
        // -2 * sum * output
        return -2.0 * activation * transferred;
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
