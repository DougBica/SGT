import { Component, Input, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';

@Component({
  selector: 'modal-page',
  templateUrl: './modalEditUser.html'
})
export class ModalPageUser implements OnInit{
  
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