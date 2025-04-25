<?php require_once 'functions.php'; ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 06 - Calculos</title>
</head>
<body>
    <h1>Aula 01 - Calculos</h1>
    
    <?php
    // Se cheguei nesta página via GET ao invés de via POST não execute mais nada.
    if(form_nao_enviado()){
        echo "<h2>Por favor, preencha o formulário</h2>";
        exit; // Outro comando igual: die;
        // Exit: interrompe a execução do script a partir deste ponto
    }

    //se algum dos campos do form nao for um valor numerico, nao execute mais nada
    if(valor_nao_numerico()){
        echo "<h2>Os valores precisam ser numericos!</h2>";
        exit;
    }

    $valor1 = $_POST['valor1'];
    $valor2 = $_POST['valor2'];

    $soma = $valor1 + $valor2;
    $subi = $valor1 - $valor2;
    $multi = $valor1 * $valor2;
    //se valor2 = 0, resultado = 0, senao( : ), valor1 / valor2
    $divi = $valor2 == 0 ? 0 : $valor1 / $valor2;

    echo "<h2>Soma: $valor1 + $valor2 = $soma<br>";
    echo "<h2>Subtração: $valor1 - $valor2 = $subi<br>";
    echo "<h2>Multiplicação: $valor1 * $valor2 = $multi<br>";
    echo "<h2>Divisão: $valor1 / $valor2 = $divi<br>";

    ?>
</body>
</html>