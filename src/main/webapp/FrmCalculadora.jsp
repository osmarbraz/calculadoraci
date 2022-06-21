<!DOCTYPE html>
<html lang="pt-br" xml:lang="pt-br">
    <head>
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form name="FrmCalculadora" method="post" action="servlet/CtrCalculadora">	
            Valor A : <input type=text name="ValorA"> <p>
                Operação:    
                <select name="operacao" id="operacao">
                    <option value="adicao">Adição</option>
                    <option value="subtracao">Subtração</option>
                    <option value="produto">Produto</option>
                    <option value="divisao">Divisão</option>
                </select><p>
                Valor B : <input type=text name="ValorB"> <p>		
                <input type="reset" value="Limpar">
            <input type="submit" name="Calcular" value="Calcular"> <p>		  
        </form>
    </body>
</html>	