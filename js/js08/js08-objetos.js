console.log("JS08 Objetos");

//crear un objeto
const frutasColor = {
    //atributos
    fresa: "roja",
    platano: "amarillo",
    pepino: "verde",
    naranja: "verde-amarillo"
}

//formas de leer un objeto
console.log( frutasColor.fresa);
console.log( frutasColor['pepino']);
const colorFrutaNaranja = "naranja";
console.log(frutasColor[colorFrutaNaranja]);
//Modificación a un valor
frutasColor[colorFrutaNaranja] = "amarillo anaranjado";
console.log(frutasColor[colorFrutaNaranja]);

//Iterando con los objetos
for (let frutaColor in frutasColor)//Voy a leer las claves
console.log("clave", frutaColor, "valor", frutasColor[frutaColor]);

/*for (let frutaColor in frutasColor)//Voy a leer los valores del objeto
console.log("valor", frutaColor);*/

//Uso de symbol
const oculto = Symbol();

const datosAutomovil = {
    modelo: "vocho",
    fabricante: "volkswagen",
    [oculto] : 250_000
}

for (let clave in datosAutomovil)
console.log("dato", datosAutomovil[clave]);

localStorage.setItem("automovil", JSON.stringify(datosAutomovil));

// Solicitud de Jaime
const words = ['hello', 'world', 'javascript'];
const capitalizedWords = words.map(word => word[0].toUpperCase() + word.slice(1));
console.log(capitalizedWords);  // ["Hello", "World", "Javascript"]

//-------------------------------------------------------------------------------------------

const myArray = [5, 7, 8, 14];

//Creando un arreglo usando el constructor
const myArrayWithConstructor = new Array (5, 7, 8, 14);
//leyendo una propiedad del objeto Array
//Propiedad de la longitud
//Las propiedades con características del objeto, éstos no llevan paréntesis
myArray.length //4

//usando el método pára extraer el 7 y el 8
console.log(myArray.slice(1, 3))//[7, 8]
