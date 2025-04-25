//Um posto de combustível deseja determinar qual de seus produtos tem a preferência de seus clientes. Para isso, deverá ser disponibilizado aos frentistas um programa que apresente o seguinte menu:
//[1] Álcool
//[2] Gasolina comum
//[3] Gasolina aditivada
//[4] Diesel
//[5] Fim
//A cada abastecimento, o frentista deverá informar qual foi o combustível vendido ao cliente e retornar ao menu. O programa deverá será encerrado quando o código informado for o número 5 escrevendo então a mensagem: "Muito obrigado!", a quantidade de abastecimentos efetuados e a quantidade de clientes que abasteceram cada tipo de combustível.


#include <stdio.h>
 
int main() {
    
    int escolha, alcool, gasolina_comum, gasolina_aditivada, diesel, total_abastecimentos;
    
    alcool = 0;
    gasolina_comum = 0;
    gasolina_aditivada = 0;
    diesel = 0;
    total_abastecimentos = 0;
    
    do{
        printf("# Menu de opções #\n");
        printf("[1] Álcool\n");
        printf("[2] Gasolina comum\n");
        printf("[3] Gasolina aditivada\n");
        printf("[4] Diesel\n");
        printf("[5] Fim\n");
        printf("Escolha uma opção: ");
        scanf("%d", &escolha);
 
        switch(escolha){
            case 1:
                alcool++;
                total_abastecimentos++;
                break;
            case 2:
                gasolina_comum++;
                total_abastecimentos++;
                break;
            case 3:
                gasolina_aditivada++;
                total_abastecimentos++;
                break;
            case 4:
                diesel++;
                total_abastecimentos++;
                break;
            case 5:
                printf("\nMuito obrigado!");
                break;
            default:
                printf("\nOpção inválida!");
        }
    } while(escolha != 5);
 
    if(total_abastecimentos == 0){
        printf("\nNão houveram abastecimentos!");
    }
    else{
        printf("\nTotal abastecimentos: %d", total_abastecimentos);
        printf("\nÁlcool: %d", alcool);
        printf("\nGasolina comum: %d", gasolina_comum);
        printf("\nGasolina aditivada: %d", gasolina_aditivada);
        printf("\nDiesel: %d ", diesel);
    }
    
    return 0;
}