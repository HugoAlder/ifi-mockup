$(document).ready(function() {
    $.ajax({
	    url: "http://localhost:8080/api/hello"
    }).then(function(data) {
       $('.hello').append(data.content);
    });
   $.ajax({
        url: "http://localhost:8080/api/environment"
    }).then(function(data) {
       $('.env').append(data.content);
    });
});
