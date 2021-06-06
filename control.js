		function valUser(){

			var nUsuario = document.getElementById("formUser").value;

			if(nUsuario.includes('@')){
				return true;}
			else{
				alert("Su nombre de usuario debe contener @");
				return false;
			}

		}

		function valPass(){

			var password = document.getElementById("formPassword").value;

			if(password == ""){
					alert("Por favor ingrese una contraseña valida");
					return false;
				}
			else{
				return true;
			}
		}

		function validacion(){
			return valUser() && valPass();
		}