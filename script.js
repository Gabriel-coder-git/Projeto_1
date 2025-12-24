function RegistraUsuario(){
    const nome = document.getElementById("usuario").value;
    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;
    const csenha = document.getElementById("senhaconfirm").value;

    console.log(nome);
    console.log(email);
    console.log(senha);
    console.log(csenha);
    
    const msg = document.getElementById("msg");

    if(senha === csenha){
        msg.textContent = "Cadastro realizado!";
        msg.style.color = "green";
        msg.style.display = "block";
    }else{
        msg.textContent = "Senhas divergentes!";
        msg.style.color = "red";
        msg.style.display = "block";
    }
}
