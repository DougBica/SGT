import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { RouterModule } from '@angular/router';

import { PerfilComponent } from './perfil.component';
import { AuthGuard } from './auth.guard';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    RouterModule.forChild([
      {
        path: '',
        component: PerfilComponent,
       
      },
      {
        path: 'conhecimento',
        loadChildren: './conhecimento/conhecimento.module#ConhecimentoPageModule',
        canActivate: [AuthGuard],
      },
      {
        path: 'formacao',
        loadChildren: './formacao/formacao.module#FormacaoPageModule',
        canActivate: [AuthGuard],
      },
      {
        path: 'user',
        loadChildren: './user/user.module#UserPageModule',
        canActivate: [AuthGuard],
      },
      {
        path: 'experiencia',
        loadChildren: './experiencia/experiencia.module#ExperienciaPageModule',
        canActivate: [AuthGuard],
      }
    ])
  ],
  declarations: [PerfilComponent]
})
export class PerfilModule {}
