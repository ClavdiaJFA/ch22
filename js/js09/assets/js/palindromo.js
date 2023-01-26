const palindromo = (palabra) => {
    /*
    function palindormo(str) {
        str = str.toLowerCase();
        var charArr = str.split('');
        var reverseArr = charArr.reverse();
        var reverseStr = reverseArr.join('');
        return str === reverseStr;
      }
      console.log(palindromo("ana")); // true */

      const palindromo = (palabra) =>{
        return palabra.
        toLowerCase() //Convierte a minusculas
        .replaceAll(" ","") //Quita todos los espacios
        .split("")//Convierte un string en un array, al escribir "", separa cada letra
        .reverse()//rotamos la palabra
        .join("") //COnvierte un array en un string

        return palabra === palabra.toLowerCase().replaceAll(" ","");
      }
      
}

module.exports = {palindormo};

