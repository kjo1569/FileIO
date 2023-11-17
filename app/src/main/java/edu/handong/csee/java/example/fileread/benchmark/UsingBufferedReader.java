package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Please provide the input file name as an argument.");
            return;
        }

        String inputFileName = args[0];

        //-------------- Test reading specified file. --------------------

        StopWatch.start();

        BufferedReader inputStream = new BufferedReader(new FileReader(inputFileName));
        while (inputStream.read() != -1) {
        }

        long duration = StopWatch.stop();
        System.out.println("Duration for " + inputFileName + ": " + duration + " milsec");

        inputStream.close();
    }
}
