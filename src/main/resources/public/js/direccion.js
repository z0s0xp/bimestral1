//vamos hacer el request a nuestro servicio usando ajax con jquery
        $.ajax({
            url:'direccion',
            type:'get',
            success:function(json){
                console.log("# de elementos encontrados"+json.length);
                for(var i=0;i<json.length;i++){
                    $("#elementos").append("<li>"+json[i].municipio+"</li>");
                    $("#TABLITA").append("<tr><td>"+json[i].id+"</td><td>"+json[i].numero+"</td><td>"+json[i].cp+"</td><td>"+json[i].municipio+"</td></tr>");
                }
            }
        });



$("#guardarDireccion").click(function () {
//Aqui aplicamos el metodo post uasando la uri del servicio
    var numero = $("#numero").val();

    var calle = $("#calle").val();

    var cp = $("#cp").val();

    var municipio = $("#municipio").val();
    $.post("direccion/" + numero + '/' + calle + '/' + cp + '/' + municipio, function (json) {
        console.log(json.id);

    });
}
);




$("#BucarPorID").click(function () {
//Aqui aplicamos el metodo post uasando la uri del servicio
    var id = $("#id").val();


    $.get("direccion/" + id, function (json) {
        console.log(json.municipio);
        $("#numero2").val(json.numero);
        $("#calle2").val(json.calle);
        $("#cp2").val(json.cp);
        $("#municipio2").val(json.municipio);
    });
}
);

//vamos hacer el request a nuestro servicio usando ajax con jquery
$("#Borrar").click(function () {
//Aqui aplicamos el metodo post uasando la uri del servicio

    var id = $("#id").val();
    eliminar = confirm("¿Deseas eliminar este registro?");
    if (eliminar) {
        console.log("Eliminado");
        $.ajax({
            type: 'delete',
            url: 'direccion/' + id,
            success: function (json) {
                alert(json.success);
            }
        });


    } else {
        alert('No se ha podido eliminar el registro...');

    }


}
);



$("#Actualizar").click(function () {
//Aqui aplicamos el metodo post uasando la uri del servicio
    var id = $("#id").val();
    var numero = $("#numero2").val();
    var calle = $("#calle2").val();
    var cp = $("#cp2").val();
    var municipio = $("#municipio2").val();

    $.ajax({
        type: 'PUT',
        url: "direccion/" + id + '/' + numero + '/' + calle + '/' + cp + '/' + municipio,
        success: function (json) {
            alert(json.municipio);

            console.log(json.municipio);
            $("#numero2").val(json.numero);
            $("#calle2").val(json.calle);
            $("#cp2").val(json.cp);
            $("#municipio2").val(json.municipio);
        }
    });
}
);




