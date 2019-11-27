import { Component, OnInit } from '@angular/core';
import { FormacaoModel } from 'src/app/core/model/formacao.model';
import { FormacaoService } from './formacao.service';
import { ModalController } from '@ionic/angular';
import { ActivatedRoute, Router } from '@angular/router';
import { ModalPageFormacao } from './modalAddFormacao/modalAdd.component';

@Component({
  selector: 'app-formacao',
  templateUrl: './formacao.page.html',
  styleUrls: ['./formacao.page.scss'],
})
export class FormacaoPage implements OnInit {
  user:any;
  public editar = false;
  listaFormacao : Array<FormacaoModel> = [];
  constructor(
    public modalController: ModalController,
    public restApi: FormacaoService,
    public activatedRoute:ActivatedRoute,
    public router: Router) {
  
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(param => {
      console.log(param);
      this.user = param['userId'];
    })
    this.restApi.listar(this.user).subscribe((data : Array<FormacaoModel>) => {
      this.listaFormacao = data;
      console.log(this.listaFormacao)
    })
    }

  async criarModalAdicionar(){
    const modal = await this.modalController.create({
      component: ModalPageFormacao
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
