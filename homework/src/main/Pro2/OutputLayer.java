package main.Pro2;

/**
 * Created by ge62 on 2016-10-15.
 */
public class OutputLayer extends Layer {
    private Neuron neuron = new Neuron();
    public OutputLayer() {
        w = (int) (Math.random()*10);//가중치는 랜덤값으로 초기화한다.
    }

    public Neuron getNeuron() {
        return neuron;
    }

    @Override
    public int getW() {
        return w;
    }


    //hidden & input layer들을 위해 추상화한 메소드를 문법상 구현해야하므로 문법적 오류만 안 일어나게하고 사용하지는 않음
    @Override
    public Neuron[] getNeurons() {
        return getNeurons();
    }
}