

$(document).ready(function(){
$("actualizar-trabajador").click(function (){
    $.ajax({
        url:'actualizar-trabajador',
        metodo:'put',
        data:{
          id:'1',
          nombre:'sandra',
          paterno:'brenda',
          materno:'garcia'
        },
        success:function(respuesta){  
        $("#resultado-actualizacion").html(respuesta);
        },
    });
    
});
});


