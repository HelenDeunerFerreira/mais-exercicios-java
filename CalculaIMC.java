// Cálculo de IMC (18,5; 24,9; 29,9; 30) Peso (Kg) / Altura (m2).
// Abaixo do peso: menor que 18,5; 
// Normal: 18,5 até 24,9; 
// Acima do peso: 24,9 a 29,9; 
// Obesidade: acima de 30;
// Fórmula: Peso (Kg) / Altura (m2)

import java.util.Scanner;

class CalculaIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float peso = sc.nextFloat();
        Float altura = sc.nextFloat();
        sc.close();

        Float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 & imc <= 24.9) {
            System.out.println("peso normal");
        } else if (imc >= 24.9 & imc <= 29.9) {
            System.out.println("acima do peso");
        } else if (imc >= 30) {
            System.out.println("obesidade");
        }
    }
}