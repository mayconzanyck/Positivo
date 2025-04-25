<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 04 - Resultado da Pesquisa</title>
</head>
<body>
    
    <h1>Resultado da Pesquisa</h1>

    <?php
    if(!empty($_GET['cliente'])){

        $cliente = $_GET['cliente'];

        //Array de clientes
        /*
        $clientes[] = "Jazon";
        $clientes[] = "Josemar";
        $clientes[] = "Rafael";
        */

        //Outra maneira de criar o mesmo array
        $clientes = [
            "Jazon",
            "Josemar",
            "Rafael"
        ];

        $encontrou = false;

        //criar foreach para percorrer o array Clientes
        foreach($clientes as $clienteAtual){
            //verificar ser o nome digitado no form, esta contido dentro do nome 'clienteAtual'
            if(str_contains($clienteAtual, $cliente)){
                echo "Cliente encontrado: " . $clienteAtual . "<br>";
                $encontrou = true;
            }
        }
        if(!$encontrou){
            echo "<h4>Nenhum nome encontrado com o nome " . $cliente . "</h4>";
        }
    }
    else{
        echo "<h3>Nenhum dado foi enviado para a pesquisa</h3>";
    }
    ?>

    <p>
        <a href="index.php">Voltar a Home</a>
    </p>

</body>
</html>