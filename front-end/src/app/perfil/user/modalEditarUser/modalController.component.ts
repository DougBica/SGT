import { Component } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { ModalPageUser } from './modalAdd.component';



@Component({
  selector: 'modal-controller'
})
export class ModalControleUser {
  constructor(public modalController: ModalController) {

  }

  async presentModal() {
    const modal = await this.modalController.create({
      component: ModalPageUser
    });
    return await modal.present();
  }
}