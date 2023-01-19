console.log("Sesion js06");

const obtenerNombre = () => prompt("Escribe tu nombre", "Claudia");

const encontrarElementoById = () => {
  const element = document.getElementById("titulo");
  //console.log("Datos del objeto: ", element);
  console.log("Entre las etiquetas" + element.innerHTML);

  //element.innerHTML += " Manipulación del DOM";
  //Con InnerHTML puedo agregar nuevas etiquetas
  const nombreDesarrollador = "Claudia"; //obtenerNombre();
  //element.innerHTML += ` Manipulación del <strong>DOM</strong> por <em>${nombreDesarrollador}</em>`;
  element.innerHTML = `<h1>${element.innerHTML} Manipulación del <strong>DOM</strong> por <em>${nombreDesarrollador}</em></h1>`;
};
encontrarElementoById();

const encontrarElementosByTagName = () => {
  //const elements = document.getElementsByTagName("p");
  const [, introRef] = document.getElementsByTagName("p");

  //Obtenemos el indice 0
  //const introRef = elements[1].innerHTML;
  //Modificamos el contenido de introRef
  console.log(introRef.innerHTML);
  introRef.innerHTML =
    "Las <strong>quesadillas</strong> van con <em>queso</em>, es un hecho";
};
encontrarElementosByTagName();

//Función que me cambia a azul el estilo de las etiquetas <em>
const cambiarColorEm = ( nuevoColor) => {
    const elements = document.getElementsByTagName("em");
    for (let element of elements)
      element.style.color = nuevoColor;
      //element.innerHTML = `<em style=color:#4682B4;>${element.innerText}</em`;
        
}
cambiarColorEm("blue");

const encontrarElementoByQuerySelector = () =>{
  const element = document.querySelector("span");
  console.log(element?.innerText);
}
encontrarElementoByQuerySelector();

const crearElemento = () => {
  const newElement = document.createElement("p");
  newElement.innerHTML = `La Ch2 es bien <strong>chida</strong> por
  <ul>
  <li>Diversas</li>
  <li>Cholos</li>
  <li>Hay clases de bienes raíces</li>
  <li>Amigables</li>
  <li>La ch22 te respalda</li>
  <li>Sin problemas en quesadillas</li>
  <li>Aplican el dicho: Haz compitas, no compitas</li>
  </ul>
  `;
  document.getElementById("").appendChild(newElement)
}