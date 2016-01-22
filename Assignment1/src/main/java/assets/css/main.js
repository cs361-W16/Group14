$(document).ready(function(){
    var usedCards = [];
   // var aceHearts = {rank: 1, suit: 1};
    var aceSpades = {rank:1, suit: 1};
    //usedCards.push(aceHearts);
    usedCards.push(aceSpades);

    $("#dealButton").click(function(){
        alert("Sending: " + JSON.stringify(usedCards));
        $.post("/AcesUp/deal", JSON.stringify(usedCards), function(data, status){
            alert("Data: " + JSON.stringify(data));
            usedCards.push(data);
        });
    });
});