$(document).ready(function(){

    $.ajax({
        url : "https://e-ndomie.herokuapp.com/diy/noodles",
        dataType : "json",
        success : function (datajson) {
            console.log("masuk");
            var indomie_list = datajson;
            for(var i = 0; i < indomie_list.length; i++) {
                var content = "<div class=\"col-sm\">" +
                    "<div class=\"card h-100\">" + '<img src="' + indomie_list[i].thumbnail + '" class="img-fluid rounded mx-auto d-block">'
                + "<h3 class='name'>" + indomie_list[i].name + "</h3>" + '<p class="price">Rp'+ indomie_list[i].cost +  ",00</p>"
                + "<p class='description'>" + indomie_list[i].description + "</p>" + "<p><button class='toCartMie'>Add to Cart</button></p>"
                + "</div></div>";
                $("#indomieJson").append(content);
            }
        },

        error: function (error) {
            var content = "<div>" + "Failed" +"</div>";
            $('#indomieJson').append(content);
        },

    });

    $.ajax({
        url : "https://e-ndomie.herokuapp.com/diy/toppings",
        dataType : "json",
        success : function (datajson) {
            console.log("masuk");
            var topping_list = datajson;
            for(var i = 0; i < topping_list.length; i++) {
                var content = "<div class=\"col-sm\">" +
                    "<div class=\"card h-100\">" + '<img src="' + topping_list[i].thumbnail + '" class="img-fluid rounded mx-auto d-block">'
                    + "<h3 class='name'>" + topping_list[i].name + "</h3>" + '<p class="price">Rp'+ topping_list[i].cost +  ",00</p>"
                    + "<p><button class='toCartTop'>Add to Cart</button></p>"
                    + "</div></div>";
                $("#toppingJson").append(content);
            }
        },

        error: function (error) {
            var content = "<div>" + "Failed" +"</div>";
            $('#toppingJson').append(content);
        },

    });


    $(document).on('click', '.toCartMie', function (){
        if($(this).text() === "Add to Cart") {
            $(this).text("Remove");
            $(this).css("background-color", "red");
            $(this).data('clicked', true);
            var descript = $(this).closest('.col-sm').find('.name').text();
            var price = $(this).closest('.col-sm').find('.price').text();
            var priceToInt = parseInt(price.substring(2, price.length-3));
            var currentPrice = parseInt($('#priceTotal').text().substring(0, $('#priceTotal').text().length));
            currentPrice = currentPrice + priceToInt;
            $('#priceTotal').text(currentPrice + ",00");
            $('#indomie-menu').append(descript);
        }
        else {
            $(this).text("Add to Cart");
            $(this).css("background-color", "black");
            $(this).data('clicked', false);
            var descript = $(this).closest('.col-sm').find('.name').text();
            var price = $(this).closest('.col-sm').find('.price').text();
            var priceToInt = parseInt(price.substring(2, price.length-3));
            var deleteIndomie = $('#indomie-menu').text().replace(descript, "");
            var currentPrice = parseInt($('#priceTotal').text().substring(0, $('#priceTotal').text().length));
            currentPrice = currentPrice - priceToInt;
            $('#priceTotal').text(currentPrice + ",00");
            $('#indomie-menu').text(deleteIndomie);
        }

    });

    $(document).on('click', '.toCartTop', function (){
        if($(this).text() === "Add to Cart") {
            $(this).text("Remove");
            $(this).css("background-color", "red");
            $(this).data('clicked', true);
            var descript = " + " + $(this).closest('.col-sm').find('.name').text();
            var price = $(this).closest('.col-sm').find('.price').text();
            var priceToInt = parseInt(price.substring(2, price.length-3));
            var currentPrice = parseInt($('#priceTotal').text().substring(0, $('#priceTotal').text().length));
            currentPrice = currentPrice + priceToInt;
            $('#priceTotal').text(currentPrice + ",00");
            $('#indomie-menu').append(descript);
        }
        else {
            $(this).text("Add to Cart");
            $(this).css("background-color", "black");
            $(this).data('clicked', false);
            var descript = " + " + $(this).closest('.col-sm').find('.name').text();
            var price = $(this).closest('.col-sm').find('.price').text();
            var priceToInt = parseInt(price.substring(2, price.length-3));
            var currentPrice = parseInt($('#priceTotal').text().substring(0, $('#priceTotal').text().length));
            currentPrice = currentPrice - priceToInt;
            $('#priceTotal').text(currentPrice + ",00");
            var deleteTopping = $('#indomie-menu').text().replace(descript, "");
            $('#indomie-menu').text(deleteTopping);
        }

    });

    function onSignIn(googleUser) {
        var profile = googleUser.getBasicProfile();
        console.log(profile.getName());
    };

    $('#submitButton').click(function () {

        function onSignIn(googleUser) {
            var profile = googleUser.getBasicProfile();
            console.log(profile.getName());
        };

        var menuCreated = {
            id,
            menu : $('#indomie-menu').text(),
            price : $('#priceTotal').text(),
        };

        console.log(id);
        var requestJSON = JSON.stringify(menuCreated);
        console.log(requestJSON);
        $.ajax({
            url : "https://e-ndomie.herokuapp.com/diy/checkout",
            type : "POST",
            contentType : 'application/json',
            data : requestJSON,
            success : function (data) {
                console.log(data);
            },
            error : function (data) {
            }
        });
    });

});



