document.getElementById("user-icon").addEventListener("click", function() {
    var userInfo = document.getElementById("user-info");
    userInfo.style.display = userInfo.style.display === "block" ? "none" : "block";
});

document.getElementById("logout-btn").addEventListener("click", function() {
    // Agrega aquí la lógica para cerrar sesión del usuario
    alert("Sesión cerrada");
});
