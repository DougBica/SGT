import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LoginService } from './login.service';
import { Router, ActivatedRoute, NavigationExtras } from '@angular/router';
import { UserModel } from '../core/model/user.model';
import { isEmpty } from 'rxjs/operators';
import { isNullOrUndefined } from 'util';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent implements OnInit {
  login: FormGroup;
  public loading = false;
  
  constructor(
    private fb: FormBuilder,
    public restApi: LoginService,
    public router: Router,
    public route : ActivatedRoute,
  ){}

  ngOnInit() {
    this.login = this.fb.group({
      login: ['',[Validators.required]],
      senha: ['',[Validators.required]]
    });
  }

  onFormSubmit(){
    console.log(this.login.value);
    this.loading = true;
    if (this.login.valid){
      this.restApi.login(this.login.value).subscribe((data: UserModel) =>{
       if(isNullOrUndefined(data) || isEmpty()){
         this.loading = false;
        this.router.navigate([`/perfil`],{queryParams: {userId:data.id}});
       }
      })
    }
  }
}
