//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList meses = new DoubleLinkedList();

        meses.insertInTheHead("January ");
        meses.insertInTheHead("February ");
        meses.insertInTheHead("March");
        meses.insertInTheHead("April ");
        meses.insertInTheHead("May ");
        meses.insertInTheHead("June ");
        meses.insertInTheHead("July ");
        meses.insertInTheHead("August");
        meses.insertInTheHead("September");
        meses.insertInTheHead("October ");
        meses.insertInTheHead("November ");
        meses.insertInTheHead("December  ");

        meses.printAtHead();
        meses.printJustIfHaveMoreThanFiveLetter();


    }
}