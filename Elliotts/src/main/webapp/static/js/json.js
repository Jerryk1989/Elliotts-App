//This function is run on currently on the testProduct Page only.
//I am not using document ready on this because this js file is shared as
//an include in the header.jsp file.  I only need this to run on one page(testProduct.jsp).
//The document ready code calls to this function from the testProduct.jsp.
function buildTable() {

    //setting this as a variable for easier usability.
    var $products = $('#testTable');

    //This ajax call is getting the product with an id of 2.
    //In it's current state it will only accept a specific id passed
    //in the url.  It appends the data retrieved into a table.
    $.ajax({
        dataType: "json",
        url: "/api/products/2",
        type: "GET",
        success: function(data) {
            $products.append(
                "<tr>" +
                    "<td><p>" + data.productName + "</p></td>" +
                    "</tr><tr>" +
                    "<td><p>" + data.productCode + "</p></td>" +
                "</tr>");
        }
    });

    //This happens when you press the submit button.  In this case,
    //this will post the data to the api.
    $('#ProductForm').on('click', '#SubmitProduct', function(){

        //setting the input fields as variable for easier usability
        var productName = $('#productName').val();
        var productCode = $('#productCode').val();

        //logs the inputs.  Using for testing purposes right now.
        console.log('productName: ' + productName + ', productCode: ' + productCode);

        //creating our JSON object.
        var products = {
            productName: productName,
            productCode: productCode
        }

        //Used for Testing.  Checking the json object.
        console.log(products);

        //This ajax call posts the created json object above to the api.
        //In it's current state, it only takes the productName and productCode.
        $.ajax({
            type: 'POST',
            data: JSON.stringify(products),
            contentType: "application/json; charset=utf-8",
            dataType: 'json',
            url: '/api/products',
            success: function(){
                console.log("success!");
            }
        });

});
}



