import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, CanActivate } from '@angular/router';
import { Observable } from 'rxjs';
import { AlertController } from '@ionic/angular';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
 
  constructor(private alertController : AlertController){}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
    let selectId = route.paramMap.get('userId');
  
    let verifica = selectId == '3';
    return true;
    
    if(verifica){
    } else {
      this.alertController.create({
        header:'Desculpe',
        subHeader:'Não pode fazer isto',
        message:'Realize o login',
        buttons:['OK']
      }).then(alert => alert.present())
      return false;
    }
  }


  
}
