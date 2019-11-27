import { Component, OnInit } from '@angular/core';
import { Router, RouterEvent, ActivatedRoute } from '@angular/router';
import { UserModel } from '../core/model/user.model';

@Component({
  selector: 'perfil-component',
  templateUrl: 'perfil.component.html',
  styleUrls: ['perfil.component.scss'],
})
export class PerfilComponent implements OnInit{
  user : any;

  ngOnInit(): void {
    
  }
selectPath ='';
  constructor(
    public activatedRoute:ActivatedRoute,
    public router: Router
  ){
    this.activatedRoute.queryParams.subscribe(param => {
      console.log(param);
      this.user = param['userId'];
    })

  }

  public appPages = [
    {
      title: 'Perfil',
      url: `/perfil/user`,
      icon: 'md-person'
    },
    {
      title: 'Conhecimentos',
      url: '/perfil/conhecimento',
      icon: 'md-pricetags'
    },
    {
      title: 'Experiência',
      url: '/perfil/experiencia',
      icon: 'list'
    },
    {
      title: 'Formação',
      url: '/perfil/formacao',
      icon: 'md-book'
    },
    {
      title: 'Sair',
      url: 'home',
      icon: 'md-arrow-back'
    }
  ];

  passaId(url){
    console.log(url);
    this.router.navigate([url],{queryParams: {userId:this.user}})
  }
}
