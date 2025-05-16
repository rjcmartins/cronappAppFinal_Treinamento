window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Produto = window.blockly.js.blockly.Produto || {};

/**
 * @function CadastrarSaida
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:53:08
 *
 */
window.blockly.js.blockly.Produto.CadastrarSaidaArgs = [];
window.blockly.js.blockly.Produto.CadastrarSaida = async function() {
 var ProdutoId;
  //
  console.log('Passou');
  //
  if (this.cronapi.screen.getValueOfField("Entrada.active.qtdEntrada") > 0) {
    //
    this.cronapi.screen.changeValueOfField("Entrada.active.produto", this.cronapi.screen.getValueOfField("params.ProdutoId"));
    //
    (await this.cronapi.client('cronapi.screen.post').run('GetSaida'));
    //
    this.cronapi.screen.refreshDatasource("ProdutoDetail", 'true');
  } else {
    //
    this.cronapi.util.throwException('Quantidade não pode ser inferior a 1');
  }
}

/**
 * @function CadastrarEntrada
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:53:08
 *
 */
window.blockly.js.blockly.Produto.CadastrarEntradaArgs = [];
window.blockly.js.blockly.Produto.CadastrarEntrada = async function() {
 var ProdutoId;
  //
  console.log('Passou');
  //
  if (this.cronapi.screen.getValueOfField("Entrada.active.qtdEntrada") > 0) {
    //
    this.cronapi.screen.changeValueOfField("Entrada.active.produto", this.cronapi.screen.getValueOfField("params.ProdutoId"));
    //
    (await this.cronapi.client('cronapi.screen.post').run("Entrada"));
    //
    this.cronapi.screen.refreshDatasource("ProdutoDetail", 'true');
  } else {
    //
    this.cronapi.util.throwException('Quantidade não pode ser inferior a 1');
  }
}
