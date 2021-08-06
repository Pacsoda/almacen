import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearIngresoComponent } from './components/crear-ingreso/crear-ingreso.component';
import { CrearTazaComponent } from './components/crear-taza/crear-taza.component';
import { ListarTazasComponent } from './components/listar-taza/listar-tazas.component';

const routes: Routes = [
  { path: '', component: ListarTazasComponent},
  { path: 'crear-taza', component: CrearTazaComponent},
  { path: 'editar-taza/:id', component: CrearTazaComponent},
  { path: 'crear-ingreso/:id', component: CrearIngresoComponent},
  { path: '**', redirectTo: '', pathMatch: 'full'} //cualquier url redirecciona a raiz
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
