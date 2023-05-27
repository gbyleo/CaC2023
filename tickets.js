







function borrar() {
    Nombre.value = '';
    Apellido.value = '';
    Email.value = '';
    Cantidad.value = '';
    Categoria.value = '';
    valorTicketDesc = 0;
    totalSpan.innerText = 0;
    form.classList.add('needs-validation')
    form.classList.remove('was-validated')
}