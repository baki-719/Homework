package main.Pro2;

/**
 * Created by ge62 on 2016-10-18.
 */
public abstract class Layer {
    protected int w; //가중치
    protected Neuron[] neurons = new Neuron[5];

    public abstract int getW();
    public abstract Neuron[] getNeurons();
}
