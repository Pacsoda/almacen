import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Taza } from '../models/taza';

@Injectable({
  providedIn: 'root'
})
export class TazaService {

  url= 'http://localhost:8090/api/tazas/';

  constructor(private http: HttpClient) { }

  getTazas(): Observable<any>{
    return this.http.get(this.url);
  }

  eliminarTaza(id: string): Observable<any>{
    return this.http.delete(this.url + id);
  }

  guardarTaza(taza: Taza): Observable<any> {
    return this.http.post(this.url, taza);
  }

  obtenerTaza(id: string): Observable<any>{
    return this.http.get(this.url + id);
  }

  editarTaza(id: string, taza: Taza): Observable<any>{
    return this.http.put(this.url + id, taza);
  }
}
