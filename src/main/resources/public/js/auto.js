 $.ajax({
            url:'auto',
            type:'get',
            success:function(json){
                console.log("# de elementos encontrados"+json.length);
                for(var i=0;i<json.length;i++){
                    $("#elementos").append("<li>"+json[i].placa+"</li>");
                    $("#TABLITA").append("<tr><td>"+json[i].id+"</td><td>"+json[i].placa+"</td><td>"+json[i].marca+"</td><td>"+json[i].auto+"</td></tr>");
                }
            }
        });
