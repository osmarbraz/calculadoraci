<!DOCTYPE html>
<html lang="pt-br" xml:lang="pt-br">
    <head>
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form name="FrmCalculadora" method="post" action="servlet/CtrCalculadora">	
            Valor A : <input type=text name="ValorA"> <p>
                Opera��o:    
                <select name="operacao" id="operacao">
                    <option value="adicao">Adi��o</option>
                    <option value="subtracao">Subtra��o</option>
                    <option value="multiplicacao">Multiplica��o</option>
                    <option value="divisao">Divis�o</option>
                </select><p>
                Valor B : <input type=text name="ValorB"> <p>		
                <input type="reset" value="Limpar">
            <input type="submit" name="Calcular" value="Calcular"> <p>		  
        </form>
    </body>
</html>	