<%@ include file="includes/header.jsp"%>
<%@ include file="includes/navbar.jsp"%>

<div class="row contentStyling">
    <div class="col-lg-12">
        <br />
        <h2 class="text-center" style="color: white;">Customer Inquiry</h2>
        <br>
        <address class="offset-sm-2 listItems">
            <strong>TriStar Foods Inc. Distribution</strong><br>
            11333 91st Ave. N.<br>
            Maple Grove, MN 55369<br>
            Phone: 763-493-3232
        </address>
        <br>
       <form>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="FirstName">First Name:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="FirstName">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="lastName">Last Name:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="lastName">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="emailAddress">Email:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="emailAddress">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="phoneNumber">Phone:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="phoneNumber">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="city">City:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="city">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="state">State:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="state">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="zipCode">Zip:</label>
               <div class="col-6">
                   <input type="email" class="form-control" id="zipCode">
               </div>
           </div>
           <div class="form-group offset-sm-2 row">
               <label class="listItems col-form-label col-2" for="message">Message:</label>
               <div class="col-6">
                   <textarea id="message" rows="5" class="form-control"></textarea>
               </div>
           </div>
           <div class="form-group offset-sm-5 row">
           <button type="submit" class="btn btn-primary">Submit</button>
            </div>

       </form>

    </div>
</div>

<%@ include file="includes/footer.jsp"%>