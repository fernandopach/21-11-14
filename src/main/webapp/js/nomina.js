$(document).ready(function(){
//alert('probando jquery');
$("#ver-nomina").click(function(){
    $.ajax({
        url:'nomina',
        metodo:'get',
        data:{
          nombre:$("#texto-nombre").val(),
          edad:$("#texto-edad").val()
        },
        success:function(no_me_olvides){
            //alert(no_me_olvides);
            $("#resultado").html(no_me_olvides);
        },
        failure:function (error){
            
        }
    });
    
});
});


