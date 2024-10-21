function validarFormulario() {
    var nome = document.getElementById("nome").value;
    var email = document.getElementById("email").value;
    var idade = document.getElementById("idade").value;

    if (nome === "") {
        alert("O campo Nome é obrigatório.");
        return false;
    }

    if (email === "") {
        alert("O campo E-mail é obrigatório.");
        return false;
    }

    if (idade === "" || idade < 1) {
        alert("O campo Idade deve ser preenchido com um valor válido.");
        return false;
    }

    return true;
}
