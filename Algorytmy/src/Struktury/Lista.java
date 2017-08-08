package Struktury;

/**
 * Created by RENT on 2017-08-01.
 */
public class Lista {
    Element _head;
    Element _tail;
    int counter;

    public void goThorughListForward(Lista list) {
        Element p = list._head;
        while (p.next != null) {
            p = p.next;
        }
    }

    public void goThroughListBackward(Lista listB) {
        Element p = listB._tail;
        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, Lista list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtTheEnd(int newElement, Lista list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            Element prevEl = p.prev;
            prevEl.next = p;
        } else {
            list._head = p;
        }
    }

    public Element getElementForward(int data, Lista list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public Element getElementBackward(int data, Lista lista) {
        Element p = lista._tail;
        while (p.prev != null) {
            if (p.data == data) {
                break;
            }
            p = p.prev;
        }
        return p;
    }

    public void printAllElements(Lista list) {
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void addElementBeforeElement(int elementToAdd, int elementBefore, Lista list) {
        Element before = list.getElementForward(elementBefore, list);

        if (before == list._head) {
            list.addElementAtBeginning(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }

    public void addElementAfterElement(int elementToAdd, int elementAfter, Lista list) {
        Element after = list.getElementBackward(elementAfter, list);

        if (after == list._tail) {
            list.addElementAtTheEnd(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.next = after.next;
            p.next = after;
            Element nextAfter = after.next;
            nextAfter.prev = p;

            after.next = p;
            list.counter++;
        }
    }
    public void deleteElement(int elementToDelete, Lista list){
        Element toDelete = list.getElementForward(elementToDelete, list);

        list.counter--;
        if(toDelete.prev != null)
        {
            Element prevOfDelete = toDelete.prev;
            prevOfDelete.next = toDelete.next;
        }
        else
        {
            list._head = toDelete.next;
        }

        if(toDelete.next != null)
        {
            Element nextOfDelete = toDelete.next;
            nextOfDelete.prev = toDelete.prev;

        }
        else
        {
            list._tail = toDelete.prev;
        }

        toDelete = null;

    }

}
