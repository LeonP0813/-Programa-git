document.getElementById("login-btn").addEventListener("click", function() {
    const userId = document.getElementById("user-id").value;
    const password = document.getElementById("password").value;

    // Verifica las credenciales (puedes personalizar esta lógica)
    if (userId === "tu_usuario" && password === "tu_contraseña") {
        // Redirige a la página después de iniciar sesión
        window.location.href = "HTML-2-pagina.html";
    } else {
        alert("Credenciales incorrectas. Por favor, inténtalo de nuevo.");
    }
});
