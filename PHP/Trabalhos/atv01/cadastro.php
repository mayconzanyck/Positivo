<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
</head>
<body>
    
    <?php
    
    if($_SERVER["REQUEST_METHOD"] == "POST"){

        if(
            isset($_POST['nome']) && isset($_POST['consumo']) && isset($_POST['horas_dia']) && isset($_POST['dias_mes']) && isset($_POST['kw_h'])
        ){
            $nome = $_POST['nome'];
            $consumo = floatval($_POST['consumo']);
            $horas_dia = floatval($_POST['horas_dia']);
            $dias_mes = intval($_POST['dias_mes']);
            $kw_h = floatval($_POST['kw_h']);
        

        //Calculo
        $consumo_diario_kwh = ($consumo / 1000) * $horas_dia;
        $consumo_mensal_kwh = $consumo_diario_kwh * $dias_mes;
        $custo_total = $consumo_mensal_kwh * $kw_h;

        echo "<h2>Aparelho cadastrado!</h2>";
        echo "<p><strong>Nome do aparelho: </strong>" . $nome . "</p>";
        echo "<p><strong>Consumo maximo em watts: </strong>" . $consumo . "</p>";
        echo "<p><strong>Horas por dia ligado: </strong>" . $horas_dia . "</p>";
        echo "<p><strong>Dias por mês ligado: </strong>" . $dias_mes . "</p>";
        echo "<p><strong>Valor do kilowatt/hora: </strong>" . $kw_h . "</p>";

        echo "<hr>";

        echo "<h3>Resultado do Consumo:</h3>";
        echo "<p><strong>Consumo diario: </strong>" . number_format($consumo_diario_kwh, 2). "kWh</p>";
        echo "<p><strong>Consumo mensal: </strong>" . number_format($consumo_mensal_kwh, 2) . "kWh</p>";
        echo "<p><strong>Custo mensal estimado: </strong>R$" . number_format($custo_total, 2, ',', '.') . "</p>";

        echo "<hr>";

        if($custo_total <= 5){
            $categoria = "Baixa";
        } elseif ($custo_total <= 10){
            $categoria = "Moderada";
        } else {
            $categoria = "Elevada";
        }

        echo "<h3>Categoria do Consumo mensal:</h3>";
        echo "<p><strong>Categoria: </strong>" . $categoria . "</p>";
        }

        else{

        echo "<p>Todos os campos são obrigatorios!</p>";
        }

    } else{

        echo "<p>Por favor, envie o formulario.</p>";
    }
    ?>

    <p>
        <button><a href="index.php">Voltar a Home</a></button>
    </p>

</body>
</html>