<?php 

function form_nao_enviado() {
    return $_SERVER['REQUEST_METHOD'] != 'POST';
}

function ha_campos_em_branco($dados) {
    return  empty($dados['nome']) || 
            empty($dados['fone']) || 
            empty($dados['email']);
}

function verificar_select($linhas_afetadas){

    if($linhas_afetadas == 0){
        exit ("<h3>Nao a clientes para exibir.</h3>");
    }

    if($linhas_afetadas < 0){
        exit("<h3>Nao foi possivel realizar a consulta no banco.</h3>");
    }

    return; //Continua a executar o codigo (opcional)
}

?>