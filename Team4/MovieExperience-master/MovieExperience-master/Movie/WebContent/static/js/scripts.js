// Empty JS for your own code to be here

/*function validatePwd() {
var invalid = " "; // Invalid character is a space
var minLength = 6; // Minimum length
var pw1 = document.myForm.password.value;
var pw2 = document.myForm.password2.value;
// check for a value in both fields.
if (pw1 == '' || pw2 == '') {
alert('Please enter your password twice.');
return false;
}



}*/

/*  function checkFields(form) {
      
      
      return true;
  }
  
  $(function(){
      $('#home_search_form').on('submit',function(e){
          e.preventDefault();
          var oneFilled = checkFields($(this));
          if(!oneFilled) {
              alert('NO FIELDS FILLED OUT!');
          } 
      });
  });
  */
  


function validate(form){
	var genre = form.genre.value;
	var moviename = form.moviename.value;
	/*alert("Test - "+genre+" -- "+moviename);*/
	form.genre.style.borderColor="#ccc";
	form.moviename.style.borderColor="#ccc";
	if(genre=="" && moviename==""){
		/*alert("Error!!");*/
		form.genre.focus();
		form.genre.style.borderColor="red";
		form.genre.style.borderStyle="solid";
		//document.getElementById('ErrorMessgae').innerHTML="genre Blank!!";
		form.moviename.focus();
		form.moviename.style.borderColor="red";
		form.moviename.style.borderStyle="solid";
		document.getElementById('ErrorMessgae').innerHTML="Select atleast one of genre or moviename!!";
		return false;
	}
	else if(genre.length>0 && moviename.length>0)
		{
		document.getElementById('ErrorMessgae').innerHTML="Select either genre or moviename!!";
		return false;
		}
	return true;
}
/* $(document).ready(function() {

$(function() {
$("#datepicker").datepicker();
$("#format").change(function() {
$("#datepicker").datepicker("option", "dateFormat", $(this).val());
});
});
});
 
 $('.datepicker').datepicker();
 $('.datepicker').datepicker({
	    format: 'mm/dd/yyyy',
	    startDate: '-3d'
	});
 
 $.fn.datepicker.defaults.format = "mm/dd/yyyy";
 $('.datepicker').datepicker({
     startDate: '-3d'
 });

$(".dropdown-menu li a").click(function(){
  var selText = $(this).text();
  $(this).parents('.btn-group').find('.dropdown-toggle').html(selText+'<span class="caret"></span>');
});
*/
var invalid=0;
function validation(form){
	
	invalid=0;
	
	//email id validation
	if(form.emailid.value.indexOf("@") == -1){
		document.getElementById("InvalidEmail").innerHTML = "Invalid Email id";
		//return false;
		invalid += 1;
	}
	else{
		document.getElementById("InvalidEmail").innerHTML = "";
	}
	
	
	//firstname validation
	if(form.firstname.value == ""){
		document.getElementById("InvalidFirstName").innerHTML = "You must type in your First Name";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidFirstName").innerHTML = "";
	}
	
	//lastname validation
	if(form.lastname.value == ""){
		document.getElementById("InvalidLastName").innerHTML = "You must type in your last Name";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidLastName").innerHTML = "";
	}
	
	
	//password validation
	//var re = /^[a-zA-Z]\w{7,14}$/;
	var re = /^[a-zA-Z][a-zA-Z0-9_@./#&+-]{7,14}$/;
	if(!re.test(form.password.value)){
		document.getElementById("InvalidPassword").innerHTML = "Invalid Password.";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidPassword").innerHTML="";
	}
	
	
	//repeat password validation
	if(form.password.value != form.passwordtwo.value){
		document.getElementById("InvalidRepeatPassword").innerHTML="Passwords do not match";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidRepeatPassword").innerHTML="";
	}
	
	
	
	if(invalid != 0){
		return false;
	}
	
	else
	{
		return true;
	}
}

var invalid1=0;
function validation1(form){
	invalid1=0;
	
	//email id validation
	if(form.emailid.value.indexOf("@") == -1){
		document.getElementById("InvalidEmail1").innerHTML = "Invalid Email id";
		invalid1 += 1;
	}
	else{
		document.getElementById("InvalidEmail1").innerHTML = "";
	}
	
	
	//password validation
	//var re1 = /^[a-zA-Z]\w{7,14}$/;
	var re1 = /^[a-zA-Z][a-zA-Z0-9_@./#&+-]{7,14}$/;
	if(!re1.test(form.password.value)){
		document.getElementById("InvalidPassword1").innerHTML = "Invalid Password.";
		invalid1 += 1;
	}
	else{
		document.getElementById("InvalidPassword1").innerHTML="";
	}
	
	
	if(invalid1 != 0){
		return false;
	}
	
	else
	{
		return true;
	}
}




var invalid1=0;
function validation2(form){
	invalid1=0;
	
	var re2 = /^[0-9]{16,16}$/;
	
	
	if(!re2.test(form.card_num.value)){
		document.getElementById("InvalidPassword").innerHTML = "Invalid Password.";
		invalid += 1;
	}
	else{
		document.getElementById("InvalidPassword").innerHTML="";
	}
	
	
	
	//password validation
	//var re1 = /^[a-zA-Z]\w{7,14}$/;
	var re1 = /^[a-zA-Z][a-zA-Z0-9_@./#&+-]{7,14}$/;
	if(!re1.test(form.password.value)){
		document.getElementById("InvalidPassword1").innerHTML = "Invalid Password.";
		invalid1 += 1;
	}
	else{
		document.getElementById("InvalidPassword1").innerHTML="";
	}
	
	
	if(invalid1 != 0){
		return false;
	}
	
	else
	{
		return true;
	}
}