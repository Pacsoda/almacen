import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Taza } from 'src/app/models/taza';
import { Ingreso } from 'src/app/models/ingreso';
import { IngresoService } from 'src/app/services/ingreso.service';
import { TazaService } from 'src/app/services/taza.service';

@Component({
  selector: 'app-crear-ingreso',
  templateUrl: './crear-ingreso.component.html',
  styleUrls: ['./crear-ingreso.component.css']
})
export class CrearIngresoComponent implements OnInit {
  ingresoForm: FormGroup;
  id: string | null;
  taza_id: number;
  tipoTaza: string;
  color: string;
  dimensiones: string;
  capacidad: string;
  modelo: string;
  material: string;
  stock: number;

  

  constructor(private fb: FormBuilder,
    private router: Router,
    private toastr: ToastrService,
    private _ingresoService : IngresoService,
    private _tazaService : TazaService,
    private aRouter: ActivatedRoute) {
    this.ingresoForm = this.fb.group({
    cantidad: ['', Validators.required]
    })
    //this.id = this.aRouter.snapshot.paramMap.get('id')!;
    this.id = this.aRouter.snapshot.paramMap.get('id'); //obtiene el id del taza
    this.taza_id = +this.id!; //obtiene el id del taza
    this.tipoTaza = "";
    this.color = "";
    this.dimensiones = "";
    this.capacidad = "";
    this.modelo = "";
    this.material = "";
    this.stock = 0;
    }

  ngOnInit(): void {
    //manda al formulario los datos del id
    if(this.id !== null){
    this._tazaService.obtenerTaza(this.id).subscribe(data => {
      this.tipoTaza = data.tipoTaza;
      this.color = data.color;
      this.dimensiones = data.dimensiones;
      this.capacidad = data.capacidad;
      this.modelo = data.modelo;
      this.material = data.material;
      this.stock = data.stock;
    })
    }
  }

  agregarIngreso() {

    const INGRESO: Ingreso = {
      cantidad: this.ingresoForm.get('cantidad')?.value,
      taza_id: this.taza_id!
    }
    
    if(this.id !== null){
      // agregamos tazas
      console.log(INGRESO);
      this._ingresoService.guardarIngreso(this.id, INGRESO).subscribe(data => {
        this.toastr.success('El ingreso fue registrado con exito!', 'Ingreso Registrado');
        this.router.navigate(['/']);
      }, error => {
        console.log(error);
        this.ingresoForm.reset();
      })
    }else{
      console.log("erro id")
    }
    
  }

}
