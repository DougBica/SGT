import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ConhecimentoPage } from './conhecimento.page';

const routes: Routes = [
  {
    path: '',
    component: ConhecimentoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ConhecimentoPageRoutingModule {}
