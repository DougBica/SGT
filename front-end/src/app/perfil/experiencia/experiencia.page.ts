import { Component, OnInit } from '@angular/core';
import { HistoricoTrabalhoModel } from 'src/app/core/model/historicoTrabalho.model';
import { ModalController } from '@ionic/angular';
import { ConhecimentoService } from '../conhecimento/conhecimento.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ModalPageExp } from './modalAddExperiencia/modalAdd.component';
import { ExperienciaService } from './experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.page.html',
  styleUrls: ['./experiencia.page.scss'],
})
export class ExperienciaPage implements OnInit {
  user:any;
  public editar = false;
  listaExperiencia : Array<HistoricoTrabalhoModel> = [];
  constructor(
    public modalController: ModalController,
    public restApi: ExperienciaService,
    public activatedRoute:ActivatedRoute,
    public router: Router) {
  
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(param => {
      console.log(param);
      this.user = param['userId'];
    })
    this.restApi.listar(this.user).subscribe((data : Array<HistoricoTrabalhoModel>) => {
      this.listaExperiencia = data;
      console.log(this.listaExperiencia)
    })
    }

  async criarModalAdicionar(){
    const modal = await this.modalController.create({
      component: ModalPageExp
    })
    return await modal.present();
  }

  mostrarBtnModificar(){
    this.editar = true;
  }
  voltarParaPerfil(){
    this.router.navigate([`/perfil`],{queryParams: {userId:this.user}});
  }
}
