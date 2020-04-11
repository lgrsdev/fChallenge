package nse;

import nse.impl.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StdinSource chain =
                new StdinSource(
                        new Filter(integer -> (integer > 0),
                                new FixedEventWindow(2,
                                        new FoldSum(
                                                new FixedEventWindow(3,
                                                        new FoldSum(
                                                                new StdoutSink()))))));

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            chain.process(scanner.nextInt());
        }
    }
}
