function validate(){
    let uname = document.getElementsByName("uname").value;
    if(uname==""){
        alert("username cannot be empty");
        document.getElementsByName("uname").focus();
        return false;
    }
}