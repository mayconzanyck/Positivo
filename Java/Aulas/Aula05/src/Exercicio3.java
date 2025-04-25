/*
 * 3) Criar uma classe Carro onde o usuário pode ligar, desligar e acelerar o carro.
Requisitos:

Criar a classe Carro com os atributos:

String modelo
boolean ligado (inicia como false)
int velocidade (inicia em 0)
Criar métodos para:

ligar() → Define ligado = true
desligar() → Define ligado = false, mas só se a velocidade for 0
acelerar() → Aumenta a velocidade somente se o carro estiver ligado
No main(), permitir que o usuário ligue o carro e acelere.

--

Exemplo de Entrada e Saída:

Modelo do carro: Ferrari

O carro foi ligado!

Acelerando... Velocidade atual: 20 km/h

Acelerando... Velocidade atual: 40 km/h

O carro foi desligado!
*/

import java.util.Scanner;

class Carro{
    String modelo;
    boolean ligado = false;    
    int velocidade = 0;

    void ligar(){
        if(!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado!");
        }
        else{
            System.out.println("O carro ja esta ligado.");
        }
    }

    void desacelerar() {
        if (ligado && velocidade> 0) {
            velocidade -= 20;
            System.out.println("Desacelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado. Não é possível desacelerar.");
        }
    }

    void acelerar() {
        if (ligado) {
            velocidade += 20;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado. Não é possível acelerar.");
        }
    }

    void desligar() {
        if (ligado && velocidade == 0) {
            ligado = false;
            System.out.println("O carro foi desligado!");
        } else if (!ligado){
            System.out.println("O carro já está desligado.");
        } 
    }
}

public class Exercicio3 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro( );

        System.out.println("Modelo do carro : ");
        carro.modelo = scanner.nextLine();

        int opcao;
        do {
            System.out.println("\n--- Comandos do carro ---");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Acelerar");
            System.out.println("3 - Desacelerar");
            System.out.println("4 - Desligar o carro");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.acelerar();
                    break;
                case 3:
                    carro.desacelerar();
                    break;
                case 4:
                    carro.desligar();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 0);

        scanner.close();

    }
}
