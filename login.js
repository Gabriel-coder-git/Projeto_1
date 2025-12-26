function loginUsuario() {

    const nome = document.getElementById("usuario").value;
    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;

    const msg = document.getElementById("msg");

    // 2️⃣ Objeto
    const usuario = {
        nome: nome,
        email: email,
        senha: senha
    };

    // 3️⃣ Envio
    fetch("http://localhost:8080/usuarios/login", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(usuario)
    })
    .then(response => response.text())
    .then(data => {
        msg.textContent = data;
        msg.style.color = "green";
        msg.style.display = "block";
    })
    .catch(error => {
        msg.textContent = "Erro ao cadastrar usuário";
        msg.style.color = "red";
        msg.style.display = "block";
        console.error(error);
    });
}

