import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<CorpoCeleste> corpiCelesti; // generics


    public Sistema() {
        this.corpiCelesti = new ArrayList<>();
    }

    public void aggiungi(CorpoCeleste cc) {
        corpiCelesti.add(cc); // aggiungo il corpo celeste
    }

    public int contaStelle() {
        int c = 0;
        for (CorpoCeleste corpoCeleste : corpiCelesti) {
            if (corpoCeleste instanceof Stella) {
                c++;
            }
        }
        return c;
    }

    public boolean pianetiConsecutivi() {

        int x = 0;

        // Scorro tutto l array
        for (int i = 0; i < corpiCelesti.size(); i++) {

            // Se corpicelesti.get(i) è un piaeta, controllo quelli successivi
            if (corpiCelesti.get(i) instanceof Pianeta) {

                for (x++; x < corpiCelesti.size(); x++) {
                    if (corpiCelesti.get(x) instanceof Pianeta) {

                    } else {

                        return false;

                    }

                }
                x++;

            }

        }

        return true;

    }

    // Rimozione di un pianeta inserendo il suo nome
    public int rimuoviPianeti(String s) {
        int x = 0;
        for (int i = 0; i < corpiCelesti.size(); i++) {
            if (corpiCelesti.get(i).getNome().contains(s)) {
                corpiCelesti.remove(i);
                x++;
            }
        }
        return x;
    }
}



