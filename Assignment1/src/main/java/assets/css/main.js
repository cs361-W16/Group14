$(document).ready(function(){
    var usedCards = []

    $("#dealButton").click(function(){
        $.post("/AcesUp/deal.json", usedCards, function(data, status){
            alert("Data: " + JSON.stringify(data) + "\nStatus: " + status);
        });
    });
});