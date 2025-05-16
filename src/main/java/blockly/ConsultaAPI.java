package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ConsultaAPI {

public static final int TIMEOUT = 300;

/**
 *
 * @param CEP
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 16:37:32
 *
 */
public static Var Consultar(@ParamMetaData(description = "CEP", id = "d357523b") @RequestBody(required = false) Var CEP) throws Exception {
 return new Callable<Var>() {

   private Var Json = Var.VAR_NULL;

   public Var call() throws Exception {
    Json =
    cronapi.json.Operations.toJson(
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").getObjectAsString() +
    CEP.getObjectAsString() +
    Var.valueOf("/json/").getObjectAsString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.logradouro"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("logradouro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.complemento"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("complemento")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.bairro"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("bairro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.localidade"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("localidade")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.uf"),
    cronapi.json.Operations.getJsonOrMapField(Json,
    Var.valueOf("uf")));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Consulta realizada com sucesso"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

