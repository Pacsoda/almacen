export class Taza{
    id?: number;
    tipoTaza: string;
    color: string;
    dimensiones: string;
    capacidad: string;
    modelo: string;
    material: string;
    stock: number;

    constructor(tipoTaza: string, color: string, dimensiones: string, capacidad: string, modelo: string, material: string, stock: number){
        this.tipoTaza = tipoTaza;
        this.color = color;
        this.dimensiones = dimensiones;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.material = material;
        this.stock = stock;
    }
}