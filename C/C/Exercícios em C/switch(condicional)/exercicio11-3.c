#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Porguese");

    int num1, num2;
    char op;

    printf("Informe o primeiro numero: ");
    scanf("%d", &num1);

    printf("Informe o segundo numero: ");
    scanf("%d", &num2);

    printf("Informe o operador desejado: ");
    scanf(" %c", &op);

    switch(op){
        case '+': printf("A soma dos numeros resulta em %d.\n", num1 + num2); break;
        case '-': printf("A subtração dos numeros resulta em %d.\n", num1 - num2); break;
        case 'x': printf("A multiplicação dos numeros resultara em %d.\n", num1 * num2); break;
        case '/': 
            
            if(num2 == 0){
                printf("Não é possivel a divisão por 0.");
            }
            else{
                printf("Resultado: %.2f.", num1 / num2);
            }
            break;
            
            printf("A divisão dos numeros resultara em %d.\n", num1 / num2); break;
        default: printf("O operador informado é invalido.\n");
    }


    return 0;
}