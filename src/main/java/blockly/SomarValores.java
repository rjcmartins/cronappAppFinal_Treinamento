package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class SomarValores {

public static final int TIMEOUT = 300;

/**
 *
 * @param x
 * @param x0
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 17:06:56
 *
 */
public static Var Executar(@ParamMetaData(description = "x", id = "e9b95939") @RequestBody(required = false) Var x, @ParamMetaData(description = "x0", id = "0e03c1aa") Var x0) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.Resultado"),
    Var.valueOf(blockly.BlocoHC.somarValores(x.getTypedObject(double.class), x0.getTypedObject(double.class))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

