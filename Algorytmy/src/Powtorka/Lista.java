package Powtorka;

import Algorithms.AbstractAlgoritm;

/**
 * Created by RENT on 2017-08-04.
 */
public class Lista {
    Element _head;
    int counter;
    Element after;

    public void addElementBeginnig(int newElement,Lista list){
        Element p = new Element();
        p.data = newElement;
        p.next = _head;
        p = list._head;
        list.counter++;
    }
    public void addElementAfterElement(int elementToAdd,int elementAfter){

        Element p = new Element();
        p.data = elementToAdd;
        Element iterator = new Element();
        while(iterator.next != null){
            if(iterator.data == elementAfter)
                break;

            iterator = iterator.next ;
        }


        p.next = iterator.next;
        iterator.next = p;



    }
    public Element getLastElement(){
        Element iterator;
        iterator = _head;
        while (iterator.next != null){
            iterator = iterator.next;
        }
        return iterator;

    }
}
