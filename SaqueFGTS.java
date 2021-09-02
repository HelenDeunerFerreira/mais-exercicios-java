// Saldo de saque = Saldo atual * Alíquota + Parcela adicional

import java.util.Scanner;

public class SaqueFGTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu saldo atual: ");
        Float saldoAtual = sc.nextFloat();
        sc.close();

        if (saldoAtual <= 500) {
            Double aliquota = 0.5;
            int parcelaAdicional = 0;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else if (saldoAtual >= 500.01 & saldoAtual >= 1000) {
            Double aliquota = 0.4;
            int parcelaAdicional = 50;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else if (saldoAtual >= 1000.01 & saldoAtual >= 5000) {
            Double aliquota = 0.3;
            int parcelaAdicional = 150;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else if (saldoAtual >= 5000.01 & saldoAtual >= 10000) {
            Double aliquota = 0.2;
            int parcelaAdicional = 650;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else if (saldoAtual >= 10000.01 & saldoAtual >= 15000) {
            Double aliquota = 0.15;
            int parcelaAdicional = 1150;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else if (saldoAtual >= 15000.01 & saldoAtual >= 20000) {
            Double aliquota = 0.1;
            int parcelaAdicional = 1900;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else if (saldoAtual >= 20000) {
            Double aliquota = 0.05;
            int parcelaAdicional = 2900;
            Double saldoSaque = (saldoAtual * aliquota) + parcelaAdicional;
            System.out.println("O saldo para o saque de aniversário é" + saldoSaque);

        } else {
            System.out.println("O valor não é válido.");
        }

    }
}
