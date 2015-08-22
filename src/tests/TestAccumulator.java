package tests;

import algorithms.Accumulator;
import algorithms.VisualAccumulator;
import stdlib.StdOut;
import stdlib.StdRandom;

/**
 * Created by paulorcv on 22/08/15.
 */
public class TestAccumulator {

    public static void main(String args[]){

        int T = Integer.parseInt(args[0]);
//        Accumulator a = new Accumulator();
        VisualAccumulator a = new VisualAccumulator(T, 1.0);

        for (int t = 0;  t< T; t++){
            a.addDataValue(StdRandom.random());
        }

        StdOut.println(a);

    }

}
