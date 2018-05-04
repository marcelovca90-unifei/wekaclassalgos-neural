package net.sourceforge.wekaclassalgos.neural.common.training;

import java.io.Serializable;

import net.sourceforge.wekaclassalgos.neural.common.NeuralModel;
import net.sourceforge.wekaclassalgos.neural.common.RandomWrapper;
import weka.core.Instances;

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

public abstract class NeuralTrainer implements Serializable
{
    protected final RandomWrapper rand;

    public NeuralTrainer(RandomWrapper aRand)
    {
        rand = aRand;
    }

    public abstract void trainModel(NeuralModel model, Instances instances, int numIterations);
}
