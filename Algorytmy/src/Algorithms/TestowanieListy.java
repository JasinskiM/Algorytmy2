package Algorithms;

/**
 * Created by RENT on 2017-08-02.
 */
public class TestowanieListy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    String _tree[];
    int level;
    int _height;

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;
        getLevel(n);
        _tree = new String[n];
        int i;

        for (i = 0; i < n; i++) {
            _tree[i] = input[i + 1];
        }

        for (int j = i; j < _tree.length; j++) {
            _tree[j] = "AA";
        }
        System.out.printf("Poziom drzewa : %d\n", level);
        System.out.printf("Wysokosc drzewa: %d\n",_height);

        System.out.printf("Korzeniem jest %s", _tree[0]);

        for (int j = 0; j < _tree.length;j++){
            String elementLewy;
            String elementPrawy;
            String element = "";
            try {
                element = _tree[j];
                if (element.length() == 2){
                    throw new Exception();
                }
                elementLewy = _tree[2*j+1];

            }catch (Exception e){
                System.out.printf("\nElement %s jest lisciem",element);
            }
        }
        getSons("A");
        getSons("E");

    }

    private void getLevel(int n) {
        int currentSize = 0;
        int iterator = 0;
        do {
            currentSize = currentSize + (int) Math.pow(2d, (double) iterator);
            iterator++;
        }
        while (currentSize < n);
        level = _height = iterator-1;

    }
    private void getSons(String father){
        int i = 0;
        for (i = 0; i < _tree.length;i++){
            if (_tree[i].equals(father))
                break;
        }
        try {
            System.out.printf("Lewym synem elementu %s jest : %s\n",_tree[i],_tree[2*i+1]);
            System.out.printf("Prawym synem elementu %s jest : %s\n",_tree[i],_tree[2*i+2]);
        }catch (Exception e ){
            System.out.println("Element" + _tree[i]+"Nie posiada syna");
        }
    }
}
