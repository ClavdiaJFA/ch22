console.log("Sesión js04");

const nombresCH22 = ["Manuel", "Leonardo", "Melanie"];
const nombresCH14 = new Array("Andy", "Cori", "Maga", "Sebas");

console.log(nombresCH22);
console.log(nombresCH14);

const promedioEdadesCH22 = [25]; //Un elemento con el número 25
//Esta línea va a generar un arreglo de 24 elementos
const promedioEdadesCH14 = new Array(24);//[,,,,,,,,,,,,,,,,etc.]
console.log(promedioEdadesCH22);
console.log(promedioEdadesCH14);
//Conocer longitud de arreglo: .length
console.log(`No. elementos de ${promedioEdadesCH22.length}`);
console.log(`No. elementos de ${promedioEdadesCH14.length}`);
//Se recomienda declarar los arrays (objetos) con const
//para prevenir que se cambie el tipo de dato
const armasCh22 = ["manoplas", "picahielo"]; //typeof(armasCh22) = object
//armasCh22 = "filero"; //typeof(armasch22) = string
//con let se agrega "filero" al arreglo
console.log("lista de armas: " + armasCh22);
//con const no se puede modificar los datos del arreglo

//Leer un elemento del arreglo
console.log(`Jessica tiene un ${armasCh22[1]}`);
console.log(`Leonardo tiene un ${armasCh22[0]}`);
//Cambiar un dato del arreglo
//los objetos son datos mutables
armasCh22[0] = "filero";
console.log(`Leonardo tiene un ${armasCh22[0]}`);

let nombreClica = "Los Wichales";
console.log(`la variable ${nombreClica} comienza con la letra ${nombreClica[0]}`);
nombreClica[0] = "D"; //no cambia porque un string es un dato primitivo que es inmutable
console.log(`la variable ${nombreClica} comienza con la letra ${nombreClica[0]}`);
nombreClica = "The Wichales";

//Agregamos un nuevo dato al arreglo, al final
//Lo siguiente no se puede hacer porque se le está reasignando el tipo de dato
//armasCh22 = ["manoplas", "picahielo", "machete"];
//armasCh22[5] = "machete"; //["manoplas", "picahielo", , , ,"machete"]
armasCh22[2] = "machete"; //["manoplas", "picahielo","machete"]
armasCh22[armasCh22.length ] = "macana"; //agregar último elemento al arreglo
armasCh22.push("cadena, bat"); //agregar último elemento al arreglo
console.log("Agregar armas: " + armasCh22);

//agregar un elemento al inicio
armasCh22.unshift("navaja", "desarmador");
console.log("Agregar armas: " + armasCh22);

/* 
Ciclo for sintaxis
        for(instrucción; Inicio; comparación; expresión final) instrucción
        for(instrucción; Inicio; comparación; expresión final) {
            instrucciones;
        }
        for( let i = 0; i <=10; i++) {
            instrucciones;
        }

*/

//Iterar los arreglos
for(let i = 0; i < armasCh22.length; ++i ){
console.log(`indice ${i} tiene ${armasCh22[i]}`);
}

//armasCh22.forEach(callbakcfuncion)
function iterarArreglo(elemento, indice, arreglo){
    console.log(`CB indice ${i} tiene ${armasCh22[i]}`);

}

//armasCh22.forEach(iterarArreglo)
armasCh22.forEach( (elemento, indice) => 
console.log( `AF ${indice} tiene ${elemento}`));

//Iterar indices del arreglo
for (let arma in armasCh22)
console.log(`ForIn ${arma} tiene ${armasCh22[arma]}`);

//Iterar elementos del arreglo
for (let arma of armasCh22)
console.log(`ForOff arma: ${arma}`);

//Iterar de forma descendente las armas
for( let i = armasCh22.length -1; i>=0 ; i--) 
    console.log("Arma: " + armasCh22[i]);

//Para el ciclo for no es necesario indicar el Iniciio
//la comparación, la expresión final
let iteracion = 0
for(; ; ){
    console.log("valor de i " + iteracion);
    if (iteracion===10) break;
    iteracion++;
}

//La instrucción break rompe con la iteración
//La instrucción continua con la sig. iteración,
for (let i=0; i<=10; i++){
    if (i === 5) break;
    console.log("for con break " + i);
}

for (let i=0; i<=10; i++){
    if (i === 5) continue;
    console.log("for con continue " + i);
}

const participantes = [
    ["José" , "María" , "Pedro"], //ch1
    ["Tan", "Javi", "Andrea", "Santi"], //ch2
    ["Melanie", "Pavel"] //ch3
];

console.log("Persona Ch3(f2) 2a persona(c1)"
+ participantes[2][1]);
console.log("Persona Ch2(f1) 2a persona(c0)"
+ participantes[1][0]);
console.log("Persona Ch1(f0) 2a persona(c2)"
+ participantes[0][2]);

for (fila = 0; fila< participantes.length; fila++){
    console.log(participantes[fila]); //iterando filas
    for (columna = 0 ; columna< participantes [fila].length ; columna++ ){
        console.log (participantes[fila][columna]);
    }
}

//usando break en ciclos anidados
//dejar de mostrar los nombres, cuando se encuentre a Tan

//Usando una variable como bandera
let continuarIteraciones = true;
for (fila = 0 ; fila< participantes.length; fila++){
        for (columna = 0 ; columna< participantes[fila].length ; columna++ ){
            console.log(`[${fila}][${columna}]`);
            if ( continuarIteraciones)
                console.log("Uso de break " + participantes[fila][columna] );
            if ( participantes[fila][columna] === "Tan") continuarIteraciones= false;
    }   
}

//usando break ciclo Fila
for (fila = 0 ; fila< participantes.length; fila++){
        for (columna = 0 ; columna< participantes[fila].length ; columna++ ){
            console.log(`[${fila}][${columna}]`);
            if ( continuarIteraciones)
                console.log("Uso de break " + participantes[fila][columna] );
            if ( participantes[fila][columna] === "Tan") break;
    }   
}

//usando continue
cicloFila;
for(let fila = 0; fila< participantes.length; fila++){
    cicloColumna;
    for (columna = 0; columna< participantes[fila].length; columna++){
        if (participantes[fila][columna] === "Tan") continue cicloFila;
        console.log(`[${fila}][${columna}]`);
        console.log("Uso de continue " + participantes[fila][columna]);
    }
}

/*
sintaxis:
while (condicion_verdadera) instrucción;

while (condición_verdadera){
    instrucciones;
}

*/

let numiteracion = 0;
while (confirm("Quieres seguir iterando?")){
    console.log("Iteración n. " + numIteracion++);
}

//Preguntar del 1 al 10 y saber si es el número que pensó el usuario
let number = 1;
while( !confirm(`${number} es tu numero?`) ) {
    number++;    
}
console.log("Tu número es el " + number);


/*
FIFO: First Input first Output
LIFO: Last Input FIrst Output

*/

//FIFO
const alimentosPerecederos = [];
//agregando una caja.
alimentosPerecederos.push("manzanas lunes");
alimentosPerecederos.push("peras miércoles");
//sacando manzanas del lunes
console.log("Sacando a la venta " + alimentosPerecederos.shift());//lunes
console.log("Sacando a la venta " + alimentosPerecederos.shift());//miércoles

//LIFO
//ferretería
const productos = ["desarmadores","cemento"];
//agrego luces navideñas de diciembre
productos.push("luces navideñas");
console.log("sacando a la venta " + productos.pop());
console.log("sacando a la venta " + productos.pop());