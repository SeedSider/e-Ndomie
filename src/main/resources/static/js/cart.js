$(document).ready(function(){
    var id;
    var indomie;
    var desc;
    var thumbnail;

    $.ajax({

        type: "GET",
        url: 'localhost:8080/diy/noodles',
        dataType: "json",
        success: function(response){
            var indomie_list = datajson;
            for(var i = 0; i < indomie_list.length; i++) {
                var content =

                $("#orderanJson").append(content);
            }
        }
    });

    // $.ajax({
    //     url : "https://e-ndomie.herokuapp.com/diy/hasilcustom",
    //     dataType : "json",
    //     success : function (datajson) {
    //         console.log("dapet");
    //         var indomie_list = datajson;
    //         for(var i = 0; i < indomie_list.length; i++) {
    //             var content =
    //                 "<div class=\"col-sm\">" +
    //                 "<div class=\"card h-100\" id='indomieCard'>" + '<img src="' + indomie_list[i].thumbnail + '" class="img-fluid rounded mx-auto d-block">'
    //                 + "<h3>" + indomie_list[i].name + "</h3>" + '<p class="price">Rp'+ indomie_list[i].cost +  ",00</p>"
    //                 + "<p>" + indomie_list[i].description + "</p>" + "<p><button class='toCart'>Add to Cart</button></p>"
    //                 + "</div></div>";
    //
    //             $("#indomieJson").append(content);
    //         }
    //     },


    });


    });





});