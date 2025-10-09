import java.util.ArrayList;

public class Sistema {
    
    private ArrayList<CorpoCeleste> corpiCelesti; // generics


    public Sistema() {
        this.corpiCelesti = new ArrayList<>();
    }

    public void aggiungi(CorpoCeleste cc) {
        corpiCelesti.add(cc); // aggiungo il corpo celeste
    }

    // - int contaStelle, che conta quante stelle sono contenute
    public int contaStelle() {
        int c = 0;
        for (CorpoCeleste corpoCeleste : corpiCelesti) {
            if (corpoCeleste instanceof Stella) {
                c++;
            }
        }
        return c;
    }

    // - boolean pianetiConsecutivi, che verifica se i pianeti inseriti nella 
    // collezione sono tutti consecutivi (senza stelle nel mezzo)
    public boolean pianetiConsecutivi() {

        int x = 0;

        // Scorro tutto l array
        for (int i = 0; i < corpiCelesti.size(); i++) {

            // Se corpicelesti.get(i) è un pianeta, controllo quelli successivi
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

    // - boolean pianetiOrdinati, che verifica se le distanze dei pianeti sono in ordine crescente

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
    
    // - int rimuoviPianeti(String s), che toglie tutti i pianeti il cui nome contiene la sottostringa dalla collezione

    public boolean pianetiOrdinati() {
        double min = corpiCelesti.get(0).getDistanzaStella();
        boolean ordinato = false;
        for (int i = 1; i < corpiCelesti.size(); i++) {
            if (corpiCelesti.get(i).getDistanzaStella() < min) {
                return false;
            } else {
                ordinato = true;
            }
        }
        return ordinato;
    }
}



