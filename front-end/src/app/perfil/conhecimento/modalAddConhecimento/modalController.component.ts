import { Component } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { ModalPage } from './modalAdd.component';

@Component({
  selector: 'modal-controller'
})
export class ModalControle {
  constructor(public modalController: ModalController) {

  }

  async presentModal() {
    const modal = await this.modalController.create({
      component: ModalPage
    });
    return await modal.present();
  }

  
}