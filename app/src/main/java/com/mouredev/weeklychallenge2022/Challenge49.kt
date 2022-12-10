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
 */
function getHandlers(text){
    var handlers = text.match( /@\w{1,}/g )
    handlers.push(...text.match(/#\w{1,}/g))
    handlers.push(...text.match(/(((http|https):\/\/)|www.)(\S){1,}.(com|es|io|dev|org)/g))
    return handlers
}

var text = "@MoureDev es el hombre con la mejor barba del mundo. #barbaalpha. Atentos con el calendario de @aDEViento. Más info en: https://adviento.dev #retos_de_programacion con @MoureDev. Todos los retos disponibles en https://retosdeprogramacion.com. Busca las expresiones regulares en https://developer.mozilla.org"

console.log(getHandlers(text))
