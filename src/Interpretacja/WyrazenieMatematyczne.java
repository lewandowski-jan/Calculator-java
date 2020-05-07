package Interpretacja;

public class WyrazenieMatematyczne extends OperacjaMatematycznaZNawiasami {
    private String [] mozliweZnaki = {"+", "-", "/", "*"};

    // np. "4/2", "3*3", "1-2", "4.5+1"
    public Double interpretujWyrazenie(String wyrazenie) {

        if (wyrazenie.indexOf('-') == -1 && wyrazenie.indexOf('+') == -1 && wyrazenie.indexOf('*') == -1 && wyrazenie.indexOf('/') == -1) {
            System.out.println("Wprowadzono niepoprawne wyrażenie");
            return 0.0;
        }
        else if (wyrazenie.indexOf('-') != -1){
            String[] wyrazenieArray = null;
            wyrazenieArray = wyrazenie.split("-");
            double wynik = Double.parseDouble(wyrazenieArray[0])-Double.parseDouble(wyrazenieArray[1]);
            return wynik;
        }

        else if (wyrazenie.indexOf('+') != -1)
        {
            String[] wyrazenieArray = null;
            wyrazenieArray = wyrazenie.split("\\+");
            double wynik = Double.parseDouble(wyrazenieArray[0])+Double.parseDouble(wyrazenieArray[1]);
            return wynik;
        }

        else if (wyrazenie.indexOf('*') != -1)
        {
            String[] wyrazenieArray = null;
            wyrazenieArray = wyrazenie.split("\\*");
            double wynik = Double.parseDouble(wyrazenieArray[0])*Double.parseDouble(wyrazenieArray[1]);
            return wynik;
        }


        else {
            String[] wyrazenieArray = null;
            wyrazenieArray = wyrazenie.split("/");
            double wynik = Double.parseDouble(wyrazenieArray[0])/Double.parseDouble(wyrazenieArray[1]);
            return wynik;
        }
    }

    public static void main(String[] args) {
        WyrazenieMatematyczne wm = new WyrazenieMatematyczne();
        String wyrazenie = "487-34";

        System.out.println(wm.interpretujWyrazenie(wyrazenie));
    }
}
