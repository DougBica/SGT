import { Component, Input, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';

@Component({
  selector: 'modal-page',
  templateUrl: './modalAddFormacao.html'
})
export class ModalPageFormacao implements OnInit{
  
  constructor(public modalController: ModalController) {
    
  }
  ngOnInit() {
  
  }
  dismissModal(){
    this.modalController.dismiss({
      'dismissed': true
    });
  }

}