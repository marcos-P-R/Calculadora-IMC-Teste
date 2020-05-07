package org.marcos;

import org.marcos.IMC.CalculoImc;
import org.marcos.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("marcos", 85.2, 1.70);

        final var calculoImc = new CalculoImc();
        final var imc = calculoImc.calculadora(pessoa);

        if (imc < 17){
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Muito abaixo do Peso!");
        }else if (imc < 18.50){
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Abaixo do Peso");
        }else if (imc < 25.00){
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Peso Normal");
        }else if (imc < 30.00){
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Acima do Peso");
        }else if (imc < 35.00){
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Obesidade I");
        }else if (imc < 40.00){
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Obesidade II (severo)");
        }else{
            System.out.printf("Seu IMC é %.2f ", imc);
            System.out.println("Obesidade III (mórbida)");
        }
    }
}
