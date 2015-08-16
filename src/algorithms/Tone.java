package algorithms;

/*************************************************************************
 *  Compilation:  javac algorithms.Tone.java
 *  Execution:    java algorithms.Tone hz seconds
 *  Dependencies: StdAudio.java
 *
 *  This program takes the frequency and duration from the command line,
 *  and plays a sine wave of the given frequency for the given duration.
 *
 *  % java algorithms.Tone 440.0 1.5
 *
 *************************************************************************/
import stdlib.*;

public class Tone {
    public static void main(String[] args) {
        double hz       = Double.parseDouble(args[0]);    // frequency in Hz
        double duration = Double.parseDouble(args[1]);    // duration in seconds

        int N = (int) (StdAudio.SAMPLE_RATE * duration);
        System.out.println("StdAudio.SAMPLE_RATE=" + StdAudio.SAMPLE_RATE);
        System.out.println("N=" + N);

        // build sine wave with desired frequency
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++) {
            a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
            //System.out.println("a[" + i + "]=" + a[i]);
        }

        // play using standard audio
        StdAudio.play(a);
    }
}

