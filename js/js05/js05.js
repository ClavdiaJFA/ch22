console.log("Sesión js05");

//Operador de asignación
let estadoDiminutoDeMexico = "Tlaxcala";

//Operadores aritméticos
//multiplicacion
let metrosCuadrados = 10 * 30;
//tenemos 2 terrenos
//metrosCuadrados = metrosCuadrados * 2;
//Operadores simplificados
metrosCuadrados *= 2; //600

//División
//dividimos el terrenito entre 3 hijos

metrosCuadrados /= 3; //200
console.log("m2 de 3 terrenos " + metrosCuadrados);

//residuo %
//Quiero saber si los metros cuadrados son multiplo de 2
let esMultiplo2 = !(metrosCuadrados % 2) ? "Sí":"No";
console.log("La cantidad es múltiplo de 2? " + metrosCuadrados)

//Resta
let precioTerreno = 90000
let precioM2 = precioTerreno/300
console.log(`Precio del metro cuadrado ${precioM2} pesitos`);
let cantidadPagada = 30000;
let cantidadRestante = precioTerreno - cantidadPagada;
console.log(`Cantidad restante $${cantidadRestante} pesos`);

//se abonaron $10,000
console.log(`Cantidad restante $${cantidadRestante -= 10000} pesos`);

//suma
//cobro por la generación de escrituras(8% costo terreno)
/*
const costoEscrituras = precioTerreno * 0.08;
precioTerreno += costoEscrituras;
console.log("Terreno + escrituras $ " + precioTerreno);
*/
console.log("Terreno + escrituras $" + (precioTerreno += precioTerreno * 0.08));

let nivelSuenio = 99;
if (nivelSuenio++ === 100) console.log("Me voy a mimir en la sesión");
console.log("NIvel de sueño " + nivelSuenio); //100

let x = 10;
x = x + 1;
console.log(x);