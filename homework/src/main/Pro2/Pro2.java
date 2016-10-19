package main.Pro2;

/**
 * Created by ge62 on 2016-10-15.
 */
public class Pro2 {

    private int V;  // 각 레이어의 뉴런의 출력값
    private static int[] V0; // 입력 레이어의 출력값
    private static int VL; // 출력 레이어의 출력값
    private static int Vl; // 히든 레이어의 출력값
    private static InputLayer inputLayer = new InputLayer();
    private static OutputLayer outputLayer = new OutputLayer();  // 출력 레이어
    private static HiddenLayer hiddenLayer1 = new HiddenLayer();  // 히든 레이어
    private static HiddenLayer hiddenLayer2 = new HiddenLayer();
    private static HiddenLayer hiddenLayer3 = new HiddenLayer();
    private static HiddenLayer hiddenLayer4 = new HiddenLayer();
    private static HiddenLayer hiddenLayer5 = new HiddenLayer();
    private static HiddenLayer hiddenLayer6 = new HiddenLayer();
    private static HiddenLayer hiddenLayer7 = new HiddenLayer();
    private static HiddenLayer hiddenLayer8 = new HiddenLayer();
    private static HiddenLayer hiddenLayer9 = new HiddenLayer();
    private static HiddenLayer hiddenLayer10 = new HiddenLayer();
    private static int[] O;  // 레이어에 입력되는 값
    private static Layer[] DNN = {inputLayer,
            hiddenLayer1,
            hiddenLayer2,
            hiddenLayer3,
            hiddenLayer4,
            hiddenLayer5,
            hiddenLayer6,
            hiddenLayer7,
            hiddenLayer8,
            hiddenLayer9,
            hiddenLayer10,
            outputLayer};


    public static int forwardComputation(int[] O) {

        int[] Zl = new int[DNN.length - 1];
        V0 = O;

        for (int i = 1; i < DNN.length - 1; i++) {
            Zl[i - 1] = (DNN[i].getW()) * (neuronAct(DNN[i - 1].getNeurons(), V0));
            Vl += activationFuntion(Zl[i]);
        }

        int ZL = (DNN[11].getW()) * (neuronAct(DNN[10].getNeurons(), Zl));

        VL = ZL;

        return VL;
    }

    public static int neuronAct(Neuron[] neurons, int[] O) {
        int result = 0;

        for (int i = 0; i < neurons.length; i++) {
            for (int j = 0; j < O.length; j++)
                result += neurons[i].activationFuntion(O[j]);
        }
        return result;
    }

    public static int activationFuntion(int x) {
        return x;
    }


    public static void main(String[] args) {
        O = new int[]{10, 20, 30, 40, 50};
        System.out.println(forwardComputation(O));
    }
}
