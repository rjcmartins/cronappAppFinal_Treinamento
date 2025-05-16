package blockly;

import cronapi.CronapiMetaData;
import cronapi.Utils;
import cronapi.Var;
import cronapi.CronapiMetaData.CategoryType;
import cronapi.CronapiMetaData.ObjectType;	
import cronapi.ParamMetaData;
import cronapi.rest.security.CronappSecurity;


/**
 * @author Rafael Juan Cardoso Martins
 * @version 1.0
 * @since 2025-05-16
 *
 */
 
@CronappSecurity
@cronapi.CronapiMetaData(type = "blockly", categoryName = "BlocoHC")
public class BlocoHC {

    /**
     * Soma dois valores.
     * 
     * @param valor1 o primeiro valor
     * @param valor2 o segundo valor
     * @return a soma dos dois valores
     */
    @cronapi.CronapiMetaData(
        type = "function",
        name = "somarValores",
        nameTags = {"soma", "adicao", "valores", "matematica", "calculadora"},
        description = "Recebe dois valores e devolve a soma como resultado."
    )
    public static double somarValores(double valor1, double valor2) throws Exception {
        // Soma os dois valores
        var resultado = valor1 + valor2;
        // Retorna o resultado
        return resultado;
    }
}


