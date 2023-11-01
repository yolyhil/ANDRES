//Utilizamos el setTimeOut y hacemos pruevas
// de ejecucion c-03

console.log('Inicio del Programa');//1
setTimeout(()=> {
    console.log('Primer timeout');//5
}, 3000);

setTimeout(()=> {
    console.log('Segundo timeout');//2-3
}, 0);

setTimeout(()=> {
    console.log('tercer timeout');//3-4
}, 0);
console.log('Fin del Programa');//4-2
//hasta la clase del 30/08/23