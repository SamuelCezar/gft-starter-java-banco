package models;

public class CalculoTributo {

    private double totalImposto;

    public void registraImposto(Tributo t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
