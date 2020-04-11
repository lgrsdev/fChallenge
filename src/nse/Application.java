package nse;

import nse.impl.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StdinSource stdinSource                = new StdinSource();
        Filter filter                          = new Filter(integer -> (integer > 0));
        FixedEventWindow fixedEventWindow2     = new FixedEventWindow(2);
        FoldSum foldSum                        = new FoldSum();
        FixedEventWindow fixedEventWindow3     = new FixedEventWindow(3);
        FoldMedian foldMedian                  = new FoldMedian();

        stdinSource.setNext(filter);
        filter.setNext(fixedEventWindow2);
        fixedEventWindow2.setNext(foldSum);
        foldSum.setNext(fixedEventWindow3);
        fixedEventWindow3.setNext(foldMedian);
        foldMedian.setNext(new StdoutSink());

        while (scanner.hasNextInt()) {
            stdinSource.process(scanner.nextInt());
        }
    }
}
