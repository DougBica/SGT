import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { FormacaoPageRoutingModule } from './formacao-routing.module';

import { FormacaoPage } from './formacao.page';
import { ModalPageFormacao } from './modalAddFormacao/modalAdd.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    FormacaoPageRoutingModule
  ],
  declarations: [FormacaoPage, ModalPageFormacao],
  entryComponents: [ModalPageFormacao],
})
export class FormacaoPageModule {}
