package main.Pro2;

/**
 * Created by ge62 on 2016-10-15.
 */
public class HiddenLayer extends Layer{

    public HiddenLayer() {
        w = (int) (Math.random()*10); //가중치는 랜덤값으로 초기화한다.

        for(int i = 0 ; i < neurons.length ; i++)
            neurons[i] = new Neuron();
    }

    @Override
    public int getW() {
        return w;
    }
    @Override
    public Neuron[] getNeurons() {
        return neurons;
    }
}
