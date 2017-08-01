package Struktury;

/**
 * Created by RENT on 2017-08-01.
 */
public class Test extends Lista {

    public static void main(String[] args) {
        Lista andrzej = new Lista();
        andrzej.addElementAtBeginning(121,andrzej);
        andrzej.addElementAtBeginning(141,andrzej);
        andrzej.addElementAtBeginning(50,andrzej);
        andrzej.addElementAtBeginning(11,andrzej);
        andrzej.addElementAtBeginning(12,andrzej);
        andrzej.addElementAtBeginning(1213,andrzej);
        andrzej.addElementAtTheEnd(9999,andrzej);
        andrzej.addElementAfterElement(9098,9999,andrzej);
        andrzej.addElementBeforeElement(1111,9999,andrzej);
        andrzej.goThroughListBackward(andrzej);




        andrzej.printAllElements(andrzej);

    }

}
