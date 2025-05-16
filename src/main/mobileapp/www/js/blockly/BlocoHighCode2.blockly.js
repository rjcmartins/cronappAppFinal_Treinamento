(function() {
  'use strict';

    window.cronapi = window.cronapi || {};
/**
* @categoryName BlocoHighCode2
*/
window.cronapi.BlocoHighCode2 = window.cronapi.BlocoHighCode2 || {};

/**
* @type function
* @name somarNumeros
* @description Função que soma dois números
* @multilayer false
* @returns {ObjectType.LONG}
*/
window.cronapi.BlocoHighCode2.somarNumeros = async function(num1, num2) {
  // Verifica se os parâmetros são números
  if (typeof num1 !== 'number' || typeof num2 !== 'number') {
    console.log('Os parâmetros devem ser números');
    return null;
  }
  
  // Soma os números
  let soma = num1 + num2;
  
  // Retorna a soma
  return soma;
};

}).bind(window)();
