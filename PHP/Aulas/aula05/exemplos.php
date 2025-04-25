<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 05 - Mais Exemplos de Array</title>
</head>
<body>
    <h1>Aula 05 - Mais Exemplos de Array</h1>

    <h2>Debugando arrays 'livro' com print_r e var_dump</h2>

    <?php
    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        if(empty($_POST['nome'])){
            echo "Nome nao pode estar em branco";
        }

        "<br>";

        if(empty($_POST['email'])){
            echo "Email nao pode estar em branco";
        }

    //Verificando se recebemos dados do form com print_r
        echo '<pre>';
        print_r($_POST); //Superglobal $_POST
        echo '</pre>';

    "<br><br>";

    //Verificando se recebemos dados do form com var_dump
        echo '<pre>';
        var_dump($_POST);
        echo '</pre>';
    }

    $filme = [
        'titulo' => 'Titanic',
        'genero' => 'Drama',
        'diretor' => 'James Cameron',
        'ano' => 1998,
        'tomatometro' => 88.5
    ];

    echo "<h3>Print_R: </h3>";
    echo '<pre>';
    print_r($filme);
    echo '</pre>';

    echo "<h3>Var_Dump: </h3>";
    echo '<pre>';
    var_dump($filme);
    echo '</pre>';
    ?>

    <h2>Array Associativo 'livro' criado "linha a linha"</h2>

    <?php
    //criando Array linha a linha
    $livro ['titulo'] = "O Senhor dos Aneis";
    $livro ['genero'] = "Fantasia";
    $livro ['autor'] = "J. R. R. Tolkien";
    $livro ['ano'] = 1954;

    foreach($livro as $indice => $value){
        echo ucfirst($indice) . ": " . $value . "<br>";
    }
    ?>

    <h2>Form de simulaçao de news letter: </h2>

    <form action="exemplos.php" method="post">

        <input type="text" name="nome" placeholder="Nome">
        <input type="email" name="email" placeholder="E-mail">
        <br><br>
        <button type="submit">Cadastrar</button>
    
    </form>

    <?php
    //Verificando se recebemos dados do form news letter
    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        
        echo "Recebi os dados";
    }
    ?>
</body>
</html>