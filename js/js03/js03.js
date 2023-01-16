let cantante = "Claudia";
console.log(`Tu reloj es ${ cantante === 'Shakira'? "Rolex" ;
                            cantante === "Pique" ? "Casio" : "el sol"}`);

/*
    let marcaReloj;
    if( cantante === 'Shakira' ) marcaReloj = "Rolex";
    else{
        if( cantante === 'Pique') marcaReloj = "Casio"
        else marcaReloj = "el sol";
    }
    console.log("Tu reloj es ${marcaReloj}") 
*/

nombrePersona = 'Karla';
marcaReloj = '';

switch(nombrePersona){
    case 'Shakira':
        marcaReloj = 'Rolex';
        break;
    case 'Pique':
        marcaReloj = 'Casio';
        break;
    case 'Sergio':
        marcaReloj = 'El sol';
        break;
    default:
        marcaReloj = 'Uno de Cars'
}
console.log(`Switch - ${nombrePersona} tu reloj es ${ marcaReloj}`);
