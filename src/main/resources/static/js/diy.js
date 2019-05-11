$(document).ready(function(){
    $.getJSON("https://e-ndomie.herokuapp.com/diy/noodles", function(result){
        $.each(result, function(key,value) {
            $("#productsJson").append(value.name+" "+value.description+" " + value.cost);
        });
    });
});