$(document).ready(function(){

    $.ajax({
        url : "http://localhost:8080/diy/noodles",
        dataType : "json",
        success : function (datajson) {
            console.log("masuk");
            var indomie_list = datajson;
            for(var i = 0; i < indomie_list.length; i++) {
                var content = "<div class=\"col-sm\">" +
                    "<div class=\"card h-100\" id='indomieCard'>" + '<img src="' + indomie_list[i].thumbnail + '" class="img-fluid rounded mx-auto d-block">'
                + "<h3>" + indomie_list[i].name + "</h3>" + '<p class="price">Rp'+ indomie_list[i].cost +  ",00</p>"
                + "<p>" + indomie_list[i].description + "</p>" + "<p><button class='toCart'>Add to Cart</button></p>"
                + "</div></div>";
                $("#indomieJson").append(content);
            };
        },

        error: function (error) {
            var content = "<div>" + "Failed" +"</div>";
            $('#indomieJson').append(table_content);
        },

    });

    $.ajax({
        url : "http://localhost:8080/diy/toppings",
        dataType : "json",
        success : function (datajson) {
            console.log("masuk");
            var topping_list = datajson;
            for(var i = 0; i < topping_list.length; i++) {
                var content = "<div class=\"col-sm\">" +
                    "<div class=\"card h-100\" id='toppingCard'>" + '<img src="' + topping_list[i].thumbnail + '" class="img-fluid rounded mx-auto d-block">'
                    + "<h3>" + topping_list[i].name + "</h3>" + '<p class="price">Rp'+ topping_list[i].cost +  ",00</p>"
                    + "<p><button class='toCart'>Add to Cart</button></p>"
                    + "</div></div>";
                $("#toppingJson").append(content);
            };
        },

        error: function (error) {
            var content = "<div>" + "Failed" +"</div>";
            $('#toppingJson').append(table_content);
        },

    });

    $(document).on('click', '.toCart', function (){
        if($(this).text() == "Add to Cart") {
            $(this).text("Remove");
            $(this).css("background-color", "red");
        }
        else {
            $(this).text("Add to Cart");
            $(this).css("background-color", "black");
        }

    })




});