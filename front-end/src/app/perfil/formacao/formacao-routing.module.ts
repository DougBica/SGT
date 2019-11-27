import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormacaoPage } from './formacao.page';

const routes: Routes = [
  {
    path: '',
    component: FormacaoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FormacaoPageRoutingModule {}
