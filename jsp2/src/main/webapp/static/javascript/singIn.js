/**
 * 
 */

 
 
window.onload=function(){
	let bt = document.getElemntsByClassName("signIn-bt")[0];
	bt.disabled=true;
	
	let inputId = document.getElementById("userId");
	let inputPw = document.getElementById("userPw");
	
	inputId.addEventListener("keyup", function(){
		if(inputId.value != '' && inputPw.value != ''){
			bt.disabled=false;
		} else {
			bt.disabled=true;
		}
	});
	inputPw.addEventListener("keyup", function(){
		if(inputId.value != '' && inputPw.value != ''){
			bt.disabled=false;
		} else {
			bt.disabled=true;
		}
	});
};