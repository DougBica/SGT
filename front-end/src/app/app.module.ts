import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { PerfilModule } from './perfil/perfil.module';
import { LoginComponent } from './login/login.component';
import { PerfilComponent } from './perfil/perfil.component';
import { LoginModule } from './login/login.module';
import { ConhecimentoPageModule } from './perfil/conhecimento/conhecimento.module';
import { FormacaoPageModule } from './perfil/formacao/formacao.module';
import { ExperienciaPageModule } from './perfil/experiencia/experiencia.module';
import { UserPageModule } from './perfil/user/user.module';






@NgModule({
  declarations: [AppComponent],
  entryComponents: [ ],
  imports: [
    BrowserModule,
    HttpClientModule,
    IonicModule.forRoot(),
    AppRoutingModule,
    CommonModule,
    FormsModule,
    PerfilModule,
    LoginModule,
    ConhecimentoPageModule,
    FormacaoPageModule,
    ExperienciaPageModule,
    UserPageModule
  ],
  providers: [
    StatusBar,
    SplashScreen,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
