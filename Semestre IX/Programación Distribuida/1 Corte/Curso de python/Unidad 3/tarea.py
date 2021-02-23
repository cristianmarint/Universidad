CURRENT_PASSWORD = "condicional"


def password_validation(password):
    if CURRENT_PASSWORD.lower() == password:
        return True
    else:
        return False


for i in range(3):
    if password_validation(input("Ingrese su contraseña: ")):
        print("Contraseña correcta")
        break
else:
    print("Demasiados intentos")
