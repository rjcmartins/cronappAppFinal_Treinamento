window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Entrada = window.blockly.js.blockly.Entrada || {};

/**
 * @function CadastrarEntrada
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 16/05/2025, 13:45:24
 *
 */
window.blockly.js.blockly.Entrada.CadastrarEntradaArgs = [];
window.blockly.js.blockly.Entrada.CadastrarEntrada = async function() {

  //
  if (this.cronapi.screen.getValueOfField("Entrada.active.qtdEntrada") > 0) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("Entrada"));
  } else {
    //
    this.cronapi.util.throwException('Quantidade não pode ser inferior a 0');
  }
}
