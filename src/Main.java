import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
        Si supponga di dover definire un programma per determinare i costi di servizio legati alla
        riscossione di assegni. Il costo del servizio dipende dall’ammontare dell’assegno. Se è
        minore o uguale a 10 Euro, il costo di servizio è di 1 Euro. Se è maggiore di 10 ma minore o
        uguale a 100 Euro il costo del servizio è pari al 10% dell’importo.
                Se l’importo è maggiore di 100 Euro ma minore o uguale a 1000 Euro, il costo del servizio è
        pari a 5 Euro più il 5% dell’importo. Se il valore dell’importo è superiore a 1000 Euro, il costo
        del servizio è pari a 40 Euro più l’1% dell’importo.
                Scrivere un codice che permetta di computare questa cifra tramite un’istruzione if-else
        multi-ramo.

  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Buongiorno, sono un calcolatore dei costi di servizio");
        System.out.println("Digita l'importo dell' assegno: ");
        float riscossioneAssegni = sc.nextFloat();

        if (riscossioneAssegni <= 10)
        {
            System.out.println("L'importo dei costi di servizio è 1 euro");
        }
         else if (riscossioneAssegni >=10 && riscossioneAssegni <=100)
        {
            System.out.println("L'importo dei costi di servizio è: " + (riscossioneAssegni * 10) / 100);
            //System.out.printf("%.2f", riscossioneAssegni);
        }
        else if(riscossioneAssegni >1000 ){
            System.out.println(" L'importo dei costi di servizio è: " + riscossioneAssegni * 1 / 100 + 40);









    }}}