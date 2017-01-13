$(document).ready(function(){
	$("#cadastrar").click(function(){
	    //alert("ola");
	    $.ajax({
	        url:'cadastrar',
	        type: 'POST',
	        data: $("#formulario_cadastro").serialize(),
	        success: function(msg){
	                alert("Cadastrado com sucesso!");
	                $('#formulario_cadastro')[0].reset();
            }
        });
	    return false;
	});
});     