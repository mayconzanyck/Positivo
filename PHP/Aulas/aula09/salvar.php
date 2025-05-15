<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Aula 09 - Cadastrar Cliente</h1>
    
    <p>
        <a href="index.php">Voltar a home</a>
    </p>

    <?php
    //Inlcuir arquivo com as
        require_once 'validacoes.php';

        //verificar se chegamos na pagina via GET
        if(form_nao_enviado()){
            exit("<h3>Form não enviado. Favor preencher os dados na Home.</h3>");
        }

        //verificar se ha campos em branco no form
        if(ha_campos_em_branco($_POST)){
            exit("<h3>Por favor, preenchar todos os campos do form.</h3>");
        }

        //se nenhum erro acima foi detectado, prosseguimos:

        //copiar, em variaveis locais, os dados enviados via POST
        $nome = $_POST['nome'];
        $fone = $_POST['fone'];
        $email = $_POST['email'];

        //incluir arquivo de conexao
        require_once 'conexao.php';

        //receber uma conexao valida com o banco de dados
        //conn = connection
        $conn = conectar_banco();

        //criar comando sql para inserir dados da tabela clientes
        $sql = "INSERT INTO tb_clientes (nome, fone, email) VALUES (?, ?, ?)";

        //criar a 'declaração' (statement) de execuçao de comando sql
        $stmt = mysqli_prepare($conn, $sql);

        //verifica se a erros no sql
        if(!$stmt){
            exit("<h3>Erro na preparação do comando SQL</h3>");
        }

        //se nao ha erros do stmt, realizaremos o bind (associações) dos parametros SQL
        mysqli_stmt_bind_param($stmt, "sss", $nome, $fone, $email);

        //verifica se ocorre algum erro inesperado ao executar o comando sql
        if(!mysqli_stmt_execute($stmt)){
            exit("<h3>Erro ao salvar cliuente no BD: " . mysqli_stmt_error($stmt) . "</h3>");
        }

        echo "<h3>Cliente cadastrado com sucesso!</h3>";

        mysqli_stmt_close($stmt); //encerra açoes possiveis com esse stat
        
        mysqli_close($conn); //encerra conexao com o banco de dados
    ?>
</body>
</html>