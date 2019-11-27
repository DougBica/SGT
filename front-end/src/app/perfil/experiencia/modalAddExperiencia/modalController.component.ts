import { Component } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { ModalPageExp } from './modalAdd.component';



@Component({
  selector: 'modal-controller'
})
export class ModalControleExp {
  constructor(public modalController: ModalController) {

  }

  async presentModal() {
    const modal = await this.modalController.create({
      component: ModalPageExp
    });
    return await modal.present();
  }
}