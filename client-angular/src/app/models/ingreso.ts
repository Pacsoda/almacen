export class Ingreso{
    id?: number;
    cantidad : number;
    taza_id : number;

    constructor(cantidad: number, taza_id: number){
        this.cantidad = cantidad;
        this.taza_id = taza_id;
    }
}