import Algorithms.*;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgoritmFabric {

    public AbstractAlgoritm getAlgoritm(String name) throws Exception{
        switch (name.toLowerCase()){
            case  "test":
                return new Test();
            case "biednycamelcase":{
                return new BiednyCamelCase();
            }
            case "cezar":{
                return new SzyfCezara();
            }
            case "sortowanie":{
                return new Sortowanie();
            }
            case "palindromy":{
                return new Palindromy();
            }
            case "sortpunkt":{
                return new SortowaniePunktu();
            }
            case "spacje":{
                return new SpacjeCamelCase();
            }
            case "fib":{
                return new Fibonaczi();
            }
            case "sumajednosci":{
                return new SumaJednosci();
            }
            case "sumujemyliczbynaturalne":{
                return new SumowanieLiczNaturalnych();
            }
            case "sumaliczb":{
                return  new SumaLiczb();
            }
            case "money":{
                return new Money();
            }
            case "rok":{
                return  new Rok();
            }
            case "silnia":{
                return new Silnia();
            }
            case "sumowanierek":{
                return new SumowanieRekurencja();
            }

                default:
                    throw new Exception("Nie ma takego algorytmu !");
        }
    }
}
