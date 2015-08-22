package algorithms;

import stdlib.StdDraw;

/**
 * Created by paulorcv on 22/08/15.
 */
public class VisualAccumulator extends Accumulator{


    public VisualAccumulator(int trials, double max){
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    @Override
    public void addDataValue(double val) {
        super.addDataValue(val);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(super.getN(), val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(super.getN(), super.getTotal()/super.getN());
    }
}
