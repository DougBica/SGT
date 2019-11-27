import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ExperienciaPageRoutingModule } from './experiencia-routing.module';

import { ExperienciaPage } from './experiencia.page';
import { ModalPageExp } from './modalAddExperiencia/modalAdd.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ExperienciaPageRoutingModule
  ],
  declarations: [ExperienciaPage, ModalPageExp ],
  entryComponents: [ModalPageExp],
})
export class ExperienciaPageModule {}
