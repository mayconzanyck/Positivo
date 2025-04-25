<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 04 - Cadastrado</title>
</head>
<body>
    
    <p>
        <a href="index.php">Voltar a Home</a>
    </p>

    <?php
        //Verificar se a pagina recebeu uma requisiçao POST

        if($_SERVER['REQUEST_METHOD'] == 'POST'){

            //Teste para ver se cada campo do form esta vazio, para cada campo vazio adicionaremos uma mensagem de erro para uma nova posiçao do array erros, o colchetes em branco[] indica quu o php criara uma nova posiçao para o array conforme a necessidade.

            //Se o form for preenchido, nao havera erros no array, logo estara vazio.

            //Array vazio = array nao existe para o php
            if(!empty($_POST['nome'])){
                $erros[] = "<h4>Nome não pode estar em branco.</h4>";
            }
            if(!empty($_POST['email'])){
                $erros[] = "<h4>E-mail não pode estar em branco.</h4>";
            }
            if(!empty($_POST['fone'])){
                $erros[] = "<h4>Telefone não pode estar em branco.</h4>";
            }

            //Verificar se nenhum campo esta vazio
            //Isset verifica se a variavel existe
            //Empty verifica se a valor na variavel
            if(!isset($erros)){

            $nome = $_POST['nome'];
            $email = $_POST['email'];
            $fone = $_POST['fone'];

            echo "<h2>Cliente Cadastrado<h2>";

            echo "Nome do cliente: " . $nome . "<br>";
            echo "E-mail: " . $email . "<br>";
            echo "Telefone: " . $fone . "<br>";
            }
            else{
                echo "<h3>Preencha todos os dados do formulario!<h3>";

                //print_r($erros); //Debbug de array

                foreach($erros as $erroAtual){
                    echo $erroAtual;
                }

                require_once('form_cadastro.php');
            }
        }
        else{
            
            echo "<h3>ATENÇÃO FORMULARIO NAO ENVIADO!</h3>";
        }
    ?>

</body>
</html>