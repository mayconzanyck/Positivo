<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <h1>Aula 02 -PHP</h1>
    
    <?php 
    //comando básico de saida
    echo "<p>Hello, world!</p>";

    //declaração de variavel
    $aluno = "Maycon Marschall Zanyck"; //string
    $rgm = 777666; //int

    echo "\n\tAluno: " . $aluno . "<br>"; //concatenação
    echo "\n\tRGM: $rgm"; //interpolação

    // \n = quebra a linha para o interpretador
    // \t = tabulação de dados para o interpretador
    ?>

</body>
</html>

<!-- Para abrir no navegador, "localhost/maycon/pasta de destino -->