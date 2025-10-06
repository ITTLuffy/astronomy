public class Pianeta extends CorpoCeleste{
    public Pianeta(String nome, double distanzaStella, double massa, double raggio) {
        super(nome, distanzaStella, massa, raggio);
    }

    public double getPeriodo(double massaStella) {
        double p = 2 * Math.PI * Math.sqrt(Math.pow(this.distanzaStella, 3) / (massaStella * G));
        return p / 3600 / 24;
    }

}
