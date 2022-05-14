import models.ContaCorrente;
import models.ContaPoupanca;
import models.SaldoException;

public class TesteContas {
    public static void main(String[] args) throws SaldoException {
        ContaCorrente cc = new ContaCorrente(0017, 03400);
        cc.depositar(100.0);

        ContaPoupanca cp = new ContaPoupanca(010, 03400);
        cp.depositar(200.0);
        cc.sacar(1);
        cp.transferir(10, cc);

        System.out.println(" ");
        System.out.println(" Seu saldo é : " + cc.getSaldo());
        System.out.println(" Seu saldo é : " + cp.getSaldo());
        System.out.println(" ");

    }
}
