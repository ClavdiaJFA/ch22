console.log("Sesión JS02");

/* 
Funciones declaradas / funciones definidas
(function declaration) / (function statement)

Caracteríticas de las funciones declaradas es que
tiene hoisting(elevación).
*/

function multipl(a, b) {
    return a * b;
}

console.log("El resultado de 5 * 10 = " + multipl(5, 10));

/*
Funciones expresadas

Las funciones expresadas (function expressions)
son funciones que son declaradas dentro de la asignación de 
una variable.

Éstas funciones pueden ser anónimas (sin nombre)

Las funciones expresadas no tienen hoisting.

*/

const suma = function (a, b) {return a+b};
console.log("la suma de 4 + 6 es igual a: " + suma (4, 6));

/* 
Funciones autoinvocadas

Este tipo de funciones (self-invoking functions)
son funciones que se ejecutan en su definición.
Pueden ser anónimas.

*/

(function saludo(){
    console.log("Hola, me estoy autoinvocando");
}
)();

/*
Funciones Flecha

Las Arrow Functions son similares a las 
funciones expresadas, pero no requiren la
palabra function.
Además, si sólo tiene una instrucción, y es
el retorno, no requiere la instrucción return
ni las llaves {}.

Tampoco tienen hoisting


*/

/*

const restaExpresada= (a, b){
    return a-b;
}
*/
const resta = (a, b) => a -b;
console.log("La resta de 20 - 2 = " + resta(20,2));

const exponente = (a, b) => {
    const result = a ** b;
    return result;
}
console.log("El núm 4^3 = " + exponente(4,3));

const exponenteAlCuadrado = a => a ** 2;
console.log("El número 4^2 = " + exponenteAlCuadrado(4));

const imprimirSaludo = () => console.log("Hola Crayola");
imprimirSaludo();


/*
Funciones con parámetros inicializados.
*/

function divide(a=1, b=1){
    return a/b;
}
console.log("La división de 3/1 = " + divide(5));

/**
Rest Parameters
EL parametro rest nos permite representar
una serie de valores indefinidos en los argumentos
como un array. 

El parámetro rest siempre debe ir al final de
todos los parámetros
 */

function sumaIndefinida(a, b, ...restoDatos){
    let suma = a+b;
    for (let i = 0; i < restoDatos.length; i++){
        suma += restoDatos[i]; //suma = suma + restDatos[i];
    }
    return suma;
}
console.log("Sumar varios números: " + sumaIndefinida(2, 3, 5, 7, 9));

/**
 *Funciones recursivas

 se trata de una función que se llama así misma
 */
//Factorial de 0 = 1
//factorial de 3 = 3 * 2 * 1
//factorial de 5 = 5 * 4 * 3 * 2 * 1

function factorialCicloFor( a ){
let total = 1;
for (i=1; i<=a; i++) {
    total *= 1;  
}
return total;
}

function factorialConRecursion(a){
    if(a < 1) return 1;
    return a * factorialConRecursion(a - 1);
}

console.log("Factorial 3 = " + factorialCicloFor(3) );//6
console.log("Factorial 5 = " + factorialCicloFor(5) );//120
console.log("Factorial 3 = " + factorialConRecursion(3) );
console.log("Factorial 5 = " + factorialConRecursion(5) );
