public class ExemploFor {

    public static void main(String[] args){

        for(int i = 1; i <= 10; i++){
            System.out.println("Numero: " + i);
        }

        //Exibindo valores com for-each
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 7) {
                System.out.print(numeros[i] + ".");
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }

        /* 
        //Tentando modificar os valores com for-each (NAO FUNCIONA)
        for(int num : numeros){
            num *= 2;
        }
        for(int num : numeros){
            System.out.print(num + " ");
        }
        */

        System.out.println();

        //Modificando os valores com o for
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }

        // Imprimindo os números formatados
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) { // Se for o último número
                System.out.print(numeros[i] + ".");
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
    }
}
