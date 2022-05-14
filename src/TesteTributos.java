import models.CalculoTributo;
import models.ContaCorrente;
import models.SeguroVida;

public class TesteTributos {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(017, 546);
        cc.depositar(100);

        SeguroVida seguro = new SeguroVida();

        CalculoTributo ci = new CalculoTributo();
        ci.registraImposto(cc);
        ci.registraImposto(seguro);

        System.out.println(" ");
        System.out.println(" Total de Imposto pago : " + "R$" + ci.getTotalImposto());
        System.out.println(" ");
    }
}
