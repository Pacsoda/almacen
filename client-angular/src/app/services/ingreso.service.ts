import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ingreso } from '../models/ingreso';

@Injectable({
  providedIn: 'root'
})
export class IngresoService {

  url= 'http://localhost:8090/api/ingresos/';

  constructor(private http: HttpClient) { }

  guardarIngreso(id: string, ingreso: Ingreso): Observable<any>{
    return this.http.post(this.url + id, ingreso);
  }

}
