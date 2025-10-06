public abstract class CorpoCeleste {
    
    // protected 
    protected String nome;
    protected double distanzaStella, massa, raggio;

    // costante gravitazionale
    public double G = 6.67408e-11;

    public CorpoCeleste(String nome, double distanzaStella, double massa, double raggio) { // costruttore vuoto da usare con super nelle sottoclassi
        this.nome = nome;
        this.distanzaStella = distanzaStella;
        this.massa = massa;
        this.raggio = raggio;
    }

    public String getNome() {
        return nome;
    }

    public double getDistanzaStella() {
        return distanzaStella;
    }

    // impossibile da modificare
    public final double getGravita() {
        return G * this.massa / Math.pow(raggio, 2);
    }
}
