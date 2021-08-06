import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Taza } from 'src/app/models/taza';
import { TazaService } from 'src/app/services/taza.service';

@Component({
  selector: 'app-crear-taza',
  templateUrl: './crear-taza.component.html',
  styleUrls: ['./crear-taza.component.css']
})
export class CrearTazaComponent implements OnInit {
  tazaForm: FormGroup;
  titulo = "Crear Taza";
  id: string | null;
  listTiposTazas:string[]=["calidad alta","calidad baja"];
  listTiposColores:string[]=["roja","verde","verde","café","gris","blanca"];
  listTiposCapacidad:string[]=["125 ml","250 ml","455 ml","500 ml"];

  constructor(private fb: FormBuilder,
            private router: Router,
            private toastr: ToastrService,
            private _tazaService : TazaService,
            private aRouter: ActivatedRoute) {
    this.tazaForm = this.fb.group({
      tipoTaza: ['', Validators.required],
      color: ['', Validators.required],
      dimensiones: ['', Validators.required],
      capacidad: ['', Validators.required],
      modelo: ['', Validators.required],
      material: ['', Validators.required]
    })
    //this.id = this.aRouter.snapshot.paramMap.get('id')!;
    this.id = this.aRouter.snapshot.paramMap.get('id'); //obtiene el id del taza
   }

  ngOnInit(): void {
    this.esEditar(); //valida si contiene un id el url
  }

  agregarTaza() {
    /*console.log(this.tazaForm);
    console.log(this.tazaForm.get('taza')?.value);*/

    const TAZA: Taza = {
      tipoTaza: this.tazaForm.get('tipoTaza')?.value,
      color: this.tazaForm.get('color')?.value,
      dimensiones: this.tazaForm.get('dimensiones')?.value,
      capacidad: this.tazaForm.get('capacidad')?.value,
      modelo: this.tazaForm.get('modelo')?.value,
      material: this.tazaForm.get('material')?.value,
      stock: 0
    }
    console.log(TAZA);
    if(this.id !== null){
       // editamos tazas
       this._tazaService.editarTaza(this.id, TAZA).subscribe(data =>{
         this.toastr.info('La taza fue actualizada con exito', 'Taza actualizada');
         this.router.navigate(['/']);
       }, error => {
        console.log(error);
        this.tazaForm.reset();
      })
    }else {
      // agregamos tazas
      console.log(TAZA);
      this._tazaService.guardarTaza(TAZA).subscribe(data => {
        this.toastr.success('La taza fue registrada con exito!', 'Taza Registrada');
        this.router.navigate(['/']);
      }, error => {
        console.log(error);
        this.tazaForm.reset();
      })
    }
    
  }

  esEditar(){
    if(this.id !== null){
      this.titulo = 'Editar Taza';
      //manda al formulario los datos del id
      this._tazaService.obtenerTaza(this.id).subscribe(data => {
        this.tazaForm.setValue({
          tipoTaza: data.tipoTaza,
          color: data.color,
          dimensiones: data.dimensiones,
          capacidad: data.capacidad,
          modelo: data.modelo,
          material: data.material,
          stock: 0,
        })
      })
    }
  }

}
