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
 * @since 16/05/2025, 14:04:00
 *
 */
public static Var Entrada_AtualizarProdutoAdd(@ParamMetaData(description = "Consulta_a_Entidades", id = "da0a609f") @RequestBody(required = false) Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Quantidade: ").getObjectAsString() +
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada")).getObjectAsString()).getObjectAsString());
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto"))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("Resultado produto: ").getObjectAsString() +
    Produto.getObjectAsString()).getObjectAsString());
    cronapi.json.Operations.setJsonOrMapField(Produto,
    Var.valueOf("estoque"),
    cronapi.math.Operations.sum(
    cronapi.json.Operations.getJsonOrMapField(Produto,
    Var.valueOf("estoque")),
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada"))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("Campo Atualizado:").getObjectAsString() +
    Produto.getObjectAsString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Entrada<app.entity.Entrada>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 14:04:00
 *
 */
public static void Entrada_AtualizarProdutoDeletar(@ParamMetaData(description = "Entrada", id = "5014ab0b") @RequestBody(required = false) Var Entrada) throws Exception {
  new Callable<Var>() {

   private Var Consulta_a_Entidades = Var.VAR_NULL;
   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Quantidade: ").getObjectAsString() +
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada")).getObjectAsString()).getObjectAsString());
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto"))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("Resultado produto: ").getObjectAsString() +
    Produto.getObjectAsString()).getObjectAsString());
    cronapi.json.Operations.setJsonOrMapField(Produto,
    Var.valueOf("estoque"),
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
 * @param Entrada<app.entity.Entrada>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 14:04:00
 *
 */
public static void Entrada_ValidarQtd(@ParamMetaData(description = "Entrada", id = "4b0a59f6") @RequestBody(required = false) Var Entrada) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.database.Operations.getColumn(Entrada,
    Var.valueOf("qtdEntrada")).compareTo(
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
 * @since 16/05/2025, 14:04:00
 *
 */
public static Var Saida_AtualizarProdutoAdd(@ParamMetaData(description = "Consulta_a_Entidades", id = "da0a609f") @RequestBody(required = false) Var Consulta_a_Entidades) throws Exception {
 return new Callable<Var>() {

   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Quantidade: ").getObjectAsString() +
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada")).getObjectAsString()).getObjectAsString());
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto"))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("Resultado produto: ").getObjectAsString() +
    Produto.getObjectAsString()).getObjectAsString());
    cronapi.json.Operations.setJsonOrMapField(Produto,
    Var.valueOf("estoque"),
    cronapi.math.Operations.subtract(
    cronapi.json.Operations.getJsonOrMapField(Produto,
    Var.valueOf("estoque")),
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada"))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("Campo Atualizado:").getObjectAsString() +
    Produto.getObjectAsString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param Saida<app.entity.Saida>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 14:04:00
 *
 */
public static void Saida_AtualizarProdutoDeletar(@ParamMetaData(description = "Saida", id = "5014ab0b") @RequestBody(required = false) Var Saida) throws Exception {
  new Callable<Var>() {

   private Var Consulta_a_Entidades = Var.VAR_NULL;
   private Var Produto = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Quantidade: ").getObjectAsString() +
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("qtdEntrada")).getObjectAsString()).getObjectAsString());
    Produto =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Produto"),Var.valueOf("select \n	p \nfrom \n	Produto p  \nwhere \n	p.id = :id"),Var.valueOf("id",
    cronapi.object.Operations.getObjectField(Consulta_a_Entidades,
    Var.valueOf("produto"))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("Resultado produto: ").getObjectAsString() +
    Produto.getObjectAsString()).getObjectAsString());
    cronapi.json.Operations.setJsonOrMapField(Produto,
    Var.valueOf("estoque"),
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
 * @param Saida<app.entity.Saida>
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 14:04:00
 *
 */
public static void Saida_ValidarQtd(@ParamMetaData(description = "Saida", id = "4b0a59f6") @RequestBody(required = false) Var Saida) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(
    cronapi.database.Operations.getColumn(Saida,
    Var.valueOf("qtdEntrada")).compareTo(
    Var.valueOf(1)) < 0).getObjectAsBoolean()) {
        cronapi.util.Operations.throwException(
        Var.valueOf("Quantidade inferior a 1"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

