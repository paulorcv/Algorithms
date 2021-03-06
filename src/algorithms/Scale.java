package algorithms;
/*************************************************************************
 *  Compilation:  javac algorithms.Scale.java
 *  Execution:    java algorithms.Scale filename w h
 *  Dependencies: Picture.java
 *  Data files:   http://www.cs.princeton.edu/introcs/31datatype/mandrill.jpg
 *
 *  Scales an image to w-by-h and displays both the original
 *  and the scaled version to the screen.
 *
 *  % java algorithms.Scale mandrill.jpg 200 300
 *
 *
 *************************************************************************/
import stdlib.Picture;
import stdlib.StdOut;

import java.awt.*;

public class Scale {
    public static void main(String[] args) {
        String filename = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        Picture source = new Picture(filename);
        Picture target = new Picture(w, h);
         StdOut.println("Source image: " + source.width() + "-by-" + source.height());

        for (int ti = 0; ti < w; ti++) {
            for (int tj = 0; tj < h; tj++) {
                int si = ti * source.width()  / w ;
                int sj = tj * source.height() / h ;
                Color color = source.get(si, sj);
                target.set(ti, tj, color);
            }
        }

        source.show();
        target.show();
    }
}
