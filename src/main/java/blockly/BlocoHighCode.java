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
@cronapi.CronapiMetaData(type = "blockly", categoryName = "BlocoHighCode")
public class BlocoHighCode {

    /**
     * Retorna a data atual.
     * 
     * @return a data atual
     */
    @cronapi.CronapiMetaData(
        type = "function",
        name = "dataAtual",
        nameTags = {"data", "atual", "retornar", "hoje", "datetime"},
        description = "Retorna a data atual."
    )
    public static java.time.LocalDateTime dataAtual() throws Exception {
        // Cria uma variável para armazenar a data atual
        var dataAtual = java.time.LocalDateTime.now();
        
        // Retorna a data atual
        return dataAtual;
    }
}


