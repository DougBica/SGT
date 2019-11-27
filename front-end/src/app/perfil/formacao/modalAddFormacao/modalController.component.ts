import { Component } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { ModalPageFormacao } from './modalAdd.component';



@Component({
  selector: 'modal-controller'
})
export class ModalControleExp {
  constructor(public modalController: ModalController) {

  }

  async presentModal() {
    const modal = await this.modalController.create({
      component: ModalPageFormacao
    });
    return await modal.present();
  }
}