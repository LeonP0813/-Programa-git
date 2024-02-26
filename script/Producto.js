class Producto{
    constructor(id, nombre, precio, cantidad, disponible){
        this._id = id;
        this._nombre = nombre;
        this._precio = precio;
        this._cantidad = cantidad;
        this._disponible = disponible;
    }
    get id(){
        return this._id;
    }
    set id(id){
        this._id=id;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre=nombre;
    }
    get precio(){
        return this._precio;
    }
    set precio(precio){
        this._precio=precio;
    }
    get cantidad(){
        return this._cantidad;
    }
    set cantidad(cantidad){
        this._cantidad=cantidad;
    }
    get disponible(){
        return this._disponible;
    }
    set disponible(disponible){
        this._disponible=disponible;
    }

    mostrarDatos(){
        return `${this._id} ${this._nombre} ${this._precio} ${this._cantidad} ${this._disponible} `
    }
}

const articulo = new Producto(1,"Bolso",100000,12,true)

console.log(articulo)