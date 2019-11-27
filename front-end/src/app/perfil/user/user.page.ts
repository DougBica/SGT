import { Component, OnInit } from '@angular/core';
import { UserModel } from 'src/app/core/model/user.model';
import { ModalPageUser } from './modalEditarUser/modalAdd.component';
import { UserService } from './formacao.service';
import { ModalController } from '@ionic/angular';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.page.html',
  styleUrls: ['./user.page.scss'],
})
export class UserPage implements OnInit {
  user:any;
  public editar = false;
  usuario :UserModel;


  constructor(
    public modalController: ModalController,
    public restApi: UserService,
    public activatedRoute:ActivatedRoute,
    public router: Router) {
  
  }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(param => {
      console.log(param);
      this.user = param['userId'];
    })
    this.restApi.listar(this.user).subscribe((data : UserModel) => {
      this.usuario = data;
      console.log(this.usuario)
    })
    }

  async criarModalAdicionar(){
    const modal = await this.modalController.create({
      component: ModalPageUser
    })
    return await modal.present();
  }

  mostrarBtnModificar(){
    this.editar = true;
  }
  voltarParaPerfil(){
    this.router.navigate([`/perfil`],{queryParams: {userId:this.user}});
  }
  modificarUser(data){
    this.criarModalAdicionar();
  }

}
