<%@ include file="includes/header.jsp"%>
<%@ include file="includes/navbar.jsp"%>

<script>
    $(document).ready(function() {
        buildTable();
    });
</script>
<div class="row contentStyling">
    <div class="col-lg-12">
        <ul id="testOutput">

        </ul>

            <form id="ProductForm">
                <div class="form-group offset-sm-2 row">
                    <label class="listItems col-form-label col-2" for="productName">Product Name:</label>
                    <div class="col-6">
                        <input type="text" class="form-control" id="productName">
                    </div>
                </div>
                <div class="form-group offset-sm-2 row">
                    <label class="listItems col-form-label col-2" for="productCode">Product Code:</label>
                    <div class="col-6">
                        <input type="text" class="form-control" id="productCode">
                    </div>
                </div>
                <div class="form-group offset-sm-5 row">
                    <button type="button" class="btn btn-primary" id="SubmitProduct">Submit</button>
                </div>
            </form>

        <table id="testTable">

        </table>

    </div>
</div>



<%@ include file="includes/footer.jsp"%>