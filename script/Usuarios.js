class Clientes{
    constructor(idusuario, nombre, apellido, correo){
        this._idusuario = idUsuario;
        this._nombre=nombre;
        this._apellido=apellido;
        this._correo=correo;
    }
    get(){
        return this._idusuario;
    }
    set(idusuario){
        this._idusuario=idusuario;
    }
    get(){
        return this._nombre;
    }
    set(nombre){
        this._nombre=nombre;
    }
    get(){
        return this._apellido;
    }
    set(apellido){
        this._apellido=apellido;
    }
    get(){
        return this._correo;
    }
    set(correo){
        this._correo=correo;
    }

    mostrarDatos(){
        return`${this._idusuario} ${this._nombre} ${this._apellido} ${this._correo}`
    }
}

class Empleados extends Cliente{
    constructor(idusuario, nombre, apellido, correo, idempleado, saldo){
        super(idusuario, nombre, apellido, correo);
        this._saldo=saldo;
        this._idempleado=idempleado
    }
    get(){
        return this._saldo;
    }
    set(saldo){
        this._saldo=saldo;
    }
    get(){
        return this._idempleado;
    }
    set(idempleado){
        this._idempleado=idempleado;
    }
    mostrarDatos(){
        return `${super.mostrarDatos()} ${this._idempleado} ${this._saldo}`
    }
}

class Proveedores extends Cliente{
    constructor(idusuario, nombre, apellido, correo, idproveedor, idfiscal){
        super(idusuario, nombre, apellido, correo);
        this._idproveedor=idproveedor;
        this._idfiscal=idfiscal;
    }
    get(){
        return this._idproveedor;
    }
    set(idproveedor){
        this._idproveedor=idproveedor;
    }
    get(){
        return this._idfiscal;
    }
    set(idfiscal){
        this._idfiscal=idfiscal;
    }
    mostrarDatos(){
        return `${super.mostrarDatos()} ${this._idproveedor} ${this._idfiscal}`
    }
}

const Empleado = new Empleados(1,"leo","leon","leo@mail.com",2,1020200)

console.log(Empleado)