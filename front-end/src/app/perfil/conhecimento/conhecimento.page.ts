import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { ModalPage } from './modalAddConhecimento/modalAdd.component';
import { ConhecimentoService } from './conhecimento.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ConhecimentoModel } from 'src/app/core/model/conhecimento.model';

@Component({
  selector: 'app-conhecimento',
  templateUrl: './conhecimento.page.html',
  styleUrls: ['./conhecimento.page.scss'],
})
export class ConhecimentoPage implements OnInit {
  user:any;
  public editar = false;
  listaConhecimentos : Array<ConhecimentoModel> = [];
  constructor(
    public modalController: ModalController,
    public restApi: ConhecimentoService,
    public activatedRoute:ActivatedRoute,
    public router: Router) {
  
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(param => {
      console.log(param);
      this.user = param['userId'];
    })
    this.restApi.listar(this.user).subscribe((data : Array<ConhecimentoModel>) => {
      this.listaConhecimentos = data;
      console.log(this.listaConhecimentos)
    })
    }

  async criarModalAdicionar(){
    const modal = await this.modalController.create({
      component: ModalPage
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
