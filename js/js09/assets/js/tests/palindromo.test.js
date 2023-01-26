const {palindromo} = require('../js/palindromo');

TextDecoderStream("Prueba de que Ana es palíndromo", ()=>{
    expect(palindromo("Ana")).toBe(true);
});

TextDecoderStream("Prueba de que Ana es palíndromo", ()=>{
    expect(palindromo("Somos o no somoS")).toBe(true);
});