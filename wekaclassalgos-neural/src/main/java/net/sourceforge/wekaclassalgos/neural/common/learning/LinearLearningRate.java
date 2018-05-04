package net.sourceforge.wekaclassalgos.neural.common.learning;

/**
 * Date: 25/05/2004 File: LinearLearningRate.java
 *
 * @author Jason Brownlee
 *
 */
public class LinearLearningRate extends LearningRateKernel
{
    public LinearLearningRate(double aLearningRate, int aTotalIterations)
    {
        super(aLearningRate, aTotalIterations);
    }

    @Override
    public double currentLearningRate(int aCurrentIteration)
    {
        double currentRate = (initialLearningRate * (totalIterations - aCurrentIteration) / totalIterations);
        return currentRate;
    }
}
