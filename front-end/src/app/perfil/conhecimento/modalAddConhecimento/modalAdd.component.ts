import { Component, Input, OnInit } from '@angular/core';
import { NavParams, ModalController } from '@ionic/angular';

@Component({
  selector: 'modal-page',
  templateUrl: './modalAddConhecimento.html'
})
export class ModalPage implements OnInit{
  
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