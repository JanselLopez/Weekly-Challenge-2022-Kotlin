/*
 * Reto #49
 * EL DETECTOR DE HANDLES
 * Fecha publicación enunciado: 05/11/22
 * Fecha publicación resolución: 12/12/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que sea capaz de detectar y retornar todos los handles de un texto usando solamente Expresiones Regulares.
 * Debes crear una expresión regular para cada caso:
 * - Handle usuario: Los que comienzan por "@"
 * - Handle hashtag: Los que comienzan por "#"
 * - Handle web: Los que comienzan por "www.", "http://", "https://" y finalizan con un dominio (.com, .es...)
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */

var text = "@Jansel aisfklafslk amfkldmfa #casa adkslmaf @hermes in https://loco.com #common http://loco."

console.log(getUsersHandles(text))
console.log(getHashtagsHandles(text))
console.log(getWebsHandles(text))

function getUsersHandles(text){
  return getHandles(text,
    function(e){
      return e.startsWith("@")
    }
    )
}
function getHashtagsHandles(text){
  return getHandles(text,
    function(e){
      return e.startsWith("#")
    }
    )
}

function getWebsHandles(text){
  return getHandles(text,
    function(e){
      return (e.startsWith("www.") || 
      e.startsWith("http://") ||  
      e.startsWith("https://")) &&
      (e.endsWith(".com") || e.endsWith(".es"))
    }
    )
}
function getHandles(text, fn){
  return text.split(" ").filter(e=> fn(e))
}


