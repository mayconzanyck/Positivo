<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 05 - Home</title>
</head>
<body>
    
    <h1>Aula 05 - Home</h1>

    <h2>Arrays em PHP</h2>

    <?php
    ##### DECLARAÇÃO DE ARRAYS #####

    $frutas = array("Laranja", "Maçã", "Pera");
    //      indices:    0        1        2

    $cidades = [
        "Curitiba",       //0
        "São Paulo",      //1
        "Porto Alegre",   //2
        "Florianopolis"   //3
    ];

    //Adicionando valores a arrays ja inicializados
    $frutas[] = "Melão";              //Nova posição(3)
    $cidades[] = "Rio de Janeiro";    //Nova posição(4
    
    //Criar dinamicamente o array 'idades':
    for($i = 18; $i <= 30; $i++){

        //nova posição de 'idades' recebe o valor de 'i'
        $idades[] = $i;
    }

    //Array associativo 'cliente'
    $cliente = [
        'nome' => "Maycon Marschall Zanyck",
        'email' => "maycon.zanyck@cs.up.edu.br",
        'fone' => "(41) 97777-6666"
    ];

    ##### EXIBIÇÃO DE ARRAYS #####
    echo "<h3>Valor da posição 1 do array 'frutas': </h3>";
    echo $frutas[1];

    echo "<h3>Mostrando todas as frutas do array (sem laço 'for'): </h3>";
    echo $frutas[0] . ", " . $frutas[1] . ", " . $frutas[2] . ", " . $frutas[3];

    echo "<h3>Mostrando array 'cidades' usando laço 'for': </h3>";
    for($i = 0; $i < count($cidades); $i++){
        echo $cidades[$i] . "<br>";
    }

    echo "<h3>Mostrando array 'idades' com laço foreach simples: </h3>";
    foreach($idades as $idade_atual){
        echo $idade_atual . ", ";
    }

    echo "<h3>Mostrando array associativo 'cliente' com laço foreach completo: </h3>";
    foreach($cliente as $key => $value){
        //ucfirst: torna a inicial da string maiuscula
        echo ucfirst($key) . ": " . $value . "<br>";
    }
    ?>
</body>
</html>