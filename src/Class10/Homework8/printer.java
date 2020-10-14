package Class10.Homework8;

public class printer {
    /**
     * Create a printer
     *
     * max toner level = 100
     * max pages in tray = 100
     * with 1 page printing, 1 toner is being used
     *
     * 1. addToner
     * 2. addPages
     * 3.
     *      a) printSingle
     *      b) printDouble
     * 4. printerSummary
     *      Toner level:
     *      Pages count in tray:
     * 5. checkToner
     *      if toner is less than 10; it should warn to "Add toner"
     */
    int tonerLevel = 100;
    int paperInTray = 100;

    /**
     * 1. addToner
     */
    public void addToner (int extraToner){
        tonerLevel = tonerLevel + extraToner;
        if (tonerLevel>100) {
            tonerLevel = 100;
            System.out.println("Can not add more toner");
        } else {
            System.out.println("Toner has been successfully added. Level of toner is " + tonerLevel );
        }
    }
    /**
     ** 2. addPages
     */
    public void addPaper (int extraPaper){
        paperInTray = paperInTray + extraPaper;
        if (paperInTray>100) {
            paperInTray = 100;
            System.out.println("Can not add more paper in tray");
        } else {
            System.out.println("Paper has been successfully added. There are " + paperInTray + "papers in a tray" );
        }
    }
    /**
    * 3.
     *      *      a) printSingle
     */
    public void printSingle (int singlePrinting) {
        if (singlePrinting <= tonerLevel && singlePrinting <= paperInTray) {
            tonerLevel = tonerLevel - singlePrinting;
            paperInTray = paperInTray - singlePrinting;
            System.out.println("Printing successfully finished");
            checkToner();
        } else if (singlePrinting > tonerLevel && singlePrinting<=paperInTray) {
            tonerLevel = 0;
            paperInTray = paperInTray - singlePrinting;
            System.out.println("Toner level is " + tonerLevel + " Printing is stopped. Please add toner");
        } else if (singlePrinting > paperInTray && singlePrinting<=tonerLevel) {
            paperInTray = 0;
            tonerLevel = tonerLevel - singlePrinting;
            System.out.println("There are " + paperInTray + " papers in a tray. Printing is stopped. Please add papers into the tray");
        } else if (singlePrinting > paperInTray && singlePrinting > tonerLevel){
            tonerLevel = 0;
            paperInTray = 0;
            System.out.println("There are " + paperInTray + " papers in a tray. Printing is stopped. Please add papers into the tray" + "Toner level is " + tonerLevel + " Printing is stopped. Please add toner");
        }
    }
    /**
     * 4.
     *      *      b) printDouble
     */
    public void printDouble (int doublePrinting) {
        if (doublePrinting <= tonerLevel && doublePrinting <= paperInTray) {
            tonerLevel = tonerLevel - doublePrinting;
            paperInTray = paperInTray - doublePrinting/2;
            System.out.println("Printing successfully finished");
            checkToner();
        } else if (doublePrinting > tonerLevel && doublePrinting/2<=paperInTray) {
            tonerLevel = 0;
            paperInTray = paperInTray - doublePrinting/2;
            System.out.println("Toner level is " + tonerLevel + " Printing is stopped. Please add toner");
        } else if (doublePrinting/2 > paperInTray && doublePrinting<=tonerLevel) {
            paperInTray = 0;
            tonerLevel = tonerLevel - doublePrinting;
            System.out.println("There are " + paperInTray + " papers in a tray. Printing is stopped. Please add papers into the tray");
        } else if (doublePrinting/2 > paperInTray && doublePrinting > tonerLevel){
            tonerLevel = 0;
            paperInTray = 0;
            System.out.println("There are " + paperInTray + " papers in a tray. Printing is stopped. Please add papers into the tray" + "Toner level is " + tonerLevel + " Printing is stopped. Please add toner");
        }
    }
    /**
     * 4. printerSummary
     */
    public void printerSummary() {
        System.out.println("Current toner level is " + tonerLevel);
        System.out.println("Number of papers in a tray is " + paperInTray);
    }
    /**
     * 5. checkToner
     */
    public void checkToner() {
        if (tonerLevel<=10) {
            System.out.println("Current toner level is " + tonerLevel + ". Please add toner" );
        }
    }


    /**
     * Methods Check
     */
    public static void main(String[] args){
        printer printer1 = new printer();
        printer1.printerSummary();
        printer1.printDouble(150);
        printer1.printerSummary();
        printer1.addToner(100);
        printer1.addPaper(100);
        printer1.printSingle(20);
        printer1.printerSummary();





    }




















































}
