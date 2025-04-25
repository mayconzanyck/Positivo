#include <stdio.h> // Inclui a biblioteca padrão de entrada e saída

int main() {
    // Declaração de variáveis
    int escolha, alcool, gasolina_comum, gasolina_aditivada, diesel, total_abastecimentos;
    
    // Inicializa contadores de tipos de combustível e total de abastecimentos
    alcool = 0;
    gasolina_comum = 0;
    gasolina_aditivada = 0;
    diesel = 0;
    total_abastecimentos = 0;
    
    // Loop para exibir o menu até que o usuário escolha sair
    do {
        // Exibe o menu de opções
        printf("# Menu de opções #\n");
        printf("[1] Álcool\n");
        printf("[2] Gasolina comum\n");
        printf("[3] Gasolina aditivada\n");
        printf("[4] Diesel\n");
        printf("[5] Fim\n");
        printf("Escolha uma opção: ");
        // Lê a opção escolhida pelo usuário
        scanf("%d", &escolha);
 
        // Verifica a escolha do usuário
        switch(escolha) {
            case 1: // Se escolher Álcool
                alcool++; // Incrementa contador de álcool
                total_abastecimentos++; // Incrementa total de abastecimentos
                break;
            case 2: // Se escolher Gasolina comum
                gasolina_comum++; // Incrementa contador de gasolina comum
                total_abastecimentos++; // Incrementa total de abastecimentos
                break;
            case 3: // Se escolher Gasolina aditivada
                gasolina_aditivada++; // Incrementa contador de gasolina aditivada
                total_abastecimentos++; // Incrementa total de abastecimentos
                break;
            case 4: // Se escolher Diesel
                diesel++; // Incrementa contador de diesel
                total_abastecimentos++; // Incrementa total de abastecimentos
                break;
            case 5: // Se escolher Fim
                printf("\nMuito obrigado!"); // Mensagem de agradecimento
                break;
            default: // Para qualquer opção inválida
                printf("\nOpção inválida!"); // Mensagem de erro
        }
    } while(escolha != 5); // Continua até que o usuário escolha 5 (sair)
 
    // Verifica se houve abastecimentos
    if(total_abastecimentos == 0) {
        printf("\nNão houveram abastecimentos!"); // Mensagem caso nenhum abastecimento tenha sido feito
    } else {
        // Exibe o total de abastecimentos e a quantidade de cada tipo
        printf("\nTotal abastecimentos: %d", total_abastecimentos);
        printf("\nÁlcool: %d", alcool);
        printf("\nGasolina comum: %d", gasolina_comum);
        printf("\nGasolina aditivada: %d", gasolina_aditivada);
        printf("\nDiesel: %d ", diesel);
    }

    // Retorna 0 para indicar que o programa terminou com sucesso
    return 0;
}