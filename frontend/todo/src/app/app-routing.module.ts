import { FinalizadosComponent } from './components/finalizados/finalizados.component';
import { ReadAllComponent } from './components/read-all/read-all.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [ 
  {
    path: '',
    component: ReadAllComponent
  },
  {
    path: 'finalizados',
    component: FinalizadosComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }