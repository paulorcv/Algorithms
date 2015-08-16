package algorithms;

/*************************************************************************
 *  Compilation:  javac algorithms.Wget.java
 *  Execution:    java algorithms.Wget url
 *  Dependencies: In.java Out.java
 *
 *  Reads in a URL specified on the command line and saves its contents
 *  in a file with the given name.
 *
 *  % java algorithms.Wget http://introcs.cs.princeton.edu/java/data/codes.csv
 *
 *************************************************************************/

import stdlib.*;

public class Wget {

    public static void main(String[] args) {

        // read in data from URL
        String url = args[0];
        In in = new In(url);
        String data = in.readAll();

        // write data to a file
        String filename = url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(filename);
        out.println(data);
        out.close();
    }

}
