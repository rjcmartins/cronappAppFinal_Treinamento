window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ProdutoSaida = window.blockly.js.blockly.ProdutoSaida || {};

/**
 * @function CadastrarSaida
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:59:46
 *
 */
window.blockly.js.blockly.ProdutoSaida.CadastrarSaidaArgs = [];
window.blockly.js.blockly.ProdutoSaida.CadastrarSaida = async function() {
 var ProdutoId;
  //
  console.log('Passou saida');
  //
  if (this.cronapi.screen.getValueOfField("Saida.active.qtdSaida") > 0) {
    //
    this.cronapi.screen.changeValueOfField("Saida.active.produto", this.cronapi.screen.getValueOfField("params.ProdutoId"));
    //
    (await this.cronapi.client('cronapi.screen.post').run("Saida"));
    //
    this.cronapi.screen.refreshDatasource("ProdutoDetail", 'true');
  } else {
    //
    this.cronapi.util.throwException('Quantidade não pode ser inferior a 1');
  }
}

/**
 * @function AposDeletar
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 15:59:46
 *
 */
window.blockly.js.blockly.ProdutoSaida.AposDeletarArgs = [];
window.blockly.js.blockly.ProdutoSaida.AposDeletar = async function() {
 var ProdutoId;
  //
  this.cronapi.screen.notify('success','Deletado');
  //
  this.cronapi.screen.refreshDatasource("ProdutoDetail", 'true');
}
