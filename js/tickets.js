const valor = 200;





const apuntaBtnResumen = document.getElementById("btn_resumen");
apuntaBtnResumen.addEventListener('click', resumen);


function resumen() {
    let resultado = 0;
    const apunta_resultado = document.getElementById("precioPagar");
    const apunta_vc_cantidad = document.getElementById("vc_cantidad");
    let categoria_elegida = parseInt(categoria.value);
    
    
if (validationCustom01_nom.value !="" && validationCustom01_ap.value !="" && validationCustom01_correo.value!="" && vc_cantidad.value !=""){
    resultado = apunta_vc_cantidad.value * (valor - ((categoria_elegida * valor) / 100));
    apunta_resultado.innerText = resultado;
}
else{
    alert("Completar datos")
}
}


function borrar() {
    validationCustom01_nom.value = '';
    validationCustom01_ap.value = '';
    validationCustom01_correo.value = '';
    vc_cantidad.value = 0;
    categoria.value = 80;
    precioPagar.innerText = 0;
}


