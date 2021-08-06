import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Taza } from 'src/app/models/taza';
import { TazaService } from 'src/app/services/taza.service';

@Component({
  selector: 'app-listar-tazas',
  templateUrl: './listar-tazas.component.html',
  styleUrls: ['./listar-tazas.component.css']
})
export class ListarTazasComponent implements OnInit {
  listTazas: Taza[] = [];

  constructor(private _tazaService: TazaService,
    private toastr: ToastrService) { }

  ngOnInit(): void {
    this.obtenerTazas();
  }

  obtenerTazas(){
    this._tazaService.getTazas().subscribe(data => {
      console.log(data);
      this.listTazas = data;
    }, error => {
      console.log(error);
    })
  }

  eliminarTaza(id: any){
    this._tazaService.eliminarTaza(id).subscribe(data =>{
      this.toastr.error('La taza fue eliminado con exito', 'Taza eliminada');
      this.obtenerTazas();
    }, error => {
      console.log(error);
    })
  }

}
