#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    int tipo_combustivel;
    float litros, preco_litro, total_pagar, desconto;

   
    printf("Informe o tipo de combustível (1 para álcool, 2 para gasolina): ");
    scanf("%d", &tipo_combustivel);

    printf("Informe a quantidade de litros abastecidos: ");
    scanf("%f", &litros);

    printf("Informe o preço por litro do combustível: ");
    scanf("%f", &preco_litro);

    if(tipo_combustivel == 1){
        if(litros > 20){
        desconto = 0.05;
        }
        else{
            desconto = 0.03;
        }
    }
    else if(tipo_combustivel == 2){
        if(litros > 20){
        desconto = 0.06;
        }
        else{
            desconto = 0.035;
        }
    }
    else{
        printf("Tipo de combustivel invalido.\n");
        return 1;
    }

    total_pagar = (litros * preco_litro) * (1 - desconto);

    printf("O valor total a ser pago é de R$%.2f.\n", total_pagar);

    return 0;
}