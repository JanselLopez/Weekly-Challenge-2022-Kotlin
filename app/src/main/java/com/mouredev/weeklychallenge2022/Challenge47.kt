/*
 * Reto #47
 * VOCAL MÁS COMÚN
 * Fecha publicación enunciado: 21/11/22
 * Fecha publicación resolución: 28/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un función que reciba un texto 
 y retorne la vocal que más veces se repita.
 * - Ten cuidado con algunos casos especiales.
 * - Si no hay vocales podrá devolver vacío.
 */
 
 var text="The cat in the roof make noise"
 
 function getVocal(){
    var a = text.match(/a/g)
    var e = text.match(/e/g)
    var i = text.match(/i/g)
    var o = text.match(/o/g)
    var u = text.match(/u/g)
    var vocals = [a,e,i,o,u]
    var max= a
    vocals.forEach(arr=>{
    if(arr && max.length < arr.length){
       max = arr
    }
    })
    console.log (max[0])
 }
 
 getVocal()
