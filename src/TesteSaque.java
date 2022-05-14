import models.Conta;
import models.ContaCorrente;

import java.text.DecimalFormat;

public class TesteSaque {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(02, 8158);

        cc.depositar(200);

        try {
            cc.sacar(190);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println(df.format(cc.getSaldo()));
    }
}
