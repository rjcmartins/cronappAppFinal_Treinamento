package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.*;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Produto {

public static final int TIMEOUT = 300;

/**
 *
 * @param Consulta a Entidades<app.entity.Entrada>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:46:58
 *
 */
public static Var Entrada_AtualizarProdutoAdd(@ParamMetaData(description = "Consulta_a_Entidades", id = "da0a609f") @RequestBody(required = false) Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var produtoId = Var.VAR_NULL;
   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    produtoId =
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto")),
    Var.valueOf("id"));
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",produtoId));
    cronapi.object.Operations.setObjectField(Produto, Var.valueOf("this[0].estoque"),
    cronapi.math.Operations.sum(
    cronapi.json.Operations.getJsonOrMapField(Produto,
    Var.valueOf("estoque")),
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada"))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Consulta a Entidades<app.entity.Entrada>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:46:58
 *
 */
public static Var Entrada_AtualizarProdutoDeletar(@ParamMetaData(description = "Consulta_a_Entidades", id = "da0a609f") @RequestBody(required = false) Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var produtoId = Var.VAR_NULL;
   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    produtoId =
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto")),
    Var.valueOf("id"));
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",produtoId));
    cronapi.object.Operations.setObjectField(Produto, Var.valueOf("this[0].estoque"),
    cronapi.math.Operations.subtract(
    cronapi.json.Operations.getJsonOrMapField(Produto,
    Var.valueOf("estoque")),
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada"))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Entrada<app.entity.Saida>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:46:58
 *
 */
public static void Entrada_ValidarQtd(@ParamMetaData(description = "Entrada", id = "4b0a59f6") @RequestBody(required = false) Var Entrada) throws Exception {
  new Callable<Var>() {

   private Var Qtd = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Objeto: ").getObjectAsString() +
    Entrada.getObjectAsString()).getObjectAsString());
    Qtd =
    cronapi.object.Operations.getObjectField(Entrada, Var.valueOf("qtdEntrada"));
    System.out.println(
    Var.valueOf(
    Var.valueOf("quantidade: ").getObjectAsString() +
    Qtd.getObjectAsString()).getObjectAsString());
    if (
    Var.valueOf(Qtd.compareTo(
    Var.valueOf(1)) < 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("Quantidade inferior a 1"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Consulta a Entidades<app.entity.Saida>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:46:58
 *
 */
public static Var Saida_AtualizarProdutoAdd(@ParamMetaData(description = "Consulta_a_Entidades", id = "da0a609f") @RequestBody(required = false) Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var produtoId = Var.VAR_NULL;
   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    produtoId =
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto")),
    Var.valueOf("id"));
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",produtoId));
    cronapi.object.Operations.setObjectField(Produto, Var.valueOf("this[0].estoque"),
    cronapi.math.Operations.subtract(
    cronapi.json.Operations.getJsonOrMapField(Produto,
    Var.valueOf("estoque")),
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada"))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Consulta a Entidades<app.entity.Saida>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:46:58
 *
 */
public static Var Saida_AtualizarProdutoDeletar(@ParamMetaData(description = "Consulta_a_Entidades", id = "da0a609f") @RequestBody(required = false) Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var produtoId = Var.VAR_NULL;
   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Entrada: ").getObjectAsString() +
    Consulta_a_Entidades.getObjectAsString()).getObjectAsString());
    produtoId =
    cronapi.object.Operations.getObjectField(
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto")),
    Var.valueOf("id"));
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",produtoId));
    cronapi.object.Operations.setObjectField(Produto, Var.valueOf("this[0].estoque"),
    cronapi.math.Operations.sum(
    cronapi.json.Operations.getJsonOrMapField(Produto,
    Var.valueOf("estoque")),
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada"))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Entrada<app.entity.Entrada>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:46:58
 *
 */
public static void Saida_ValidarQtd(@ParamMetaData(description = "Entrada", id = "4b0a59f6") @RequestBody(required = false) Var Entrada) throws Exception {
  new Callable<Var>() {

   private Var Qtd = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Objeto: ").getObjectAsString() +
    Entrada.getObjectAsString()).getObjectAsString());
    Qtd =
    cronapi.object.Operations.getObjectField(Entrada, Var.valueOf("qtdEntrada"));
    System.out.println(
    Var.valueOf(
    Var.valueOf("quantidade: ").getObjectAsString() +
    Qtd.getObjectAsString()).getObjectAsString());
    if (
    Var.valueOf(Qtd.compareTo(
    Var.valueOf(1)) < 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("Quantidade inferior a 1"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

