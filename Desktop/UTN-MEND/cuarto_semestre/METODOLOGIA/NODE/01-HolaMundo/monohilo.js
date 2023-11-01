// la clase 4 fue teorica
// esta es la clase 
console.log('hola a toda la corte 2022 ');
var i=0;
setInterval(function() {
    console.log(i);
    console.log('sigo activo');
    i++;
    //generamos el error
    if(i=== 5){
        console.log('forzamos un error');
        var a = 3 + z;//error es z
    }//ctrl c interrumpe todo
    
}, 1000);
console.log('segunda instruccion'); 
//la ejecucion es asincrono