import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { FormacaoPage } from './formacao.page';

describe('FormacaoPage', () => {
  let component: FormacaoPage;
  let fixture: ComponentFixture<FormacaoPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormacaoPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(FormacaoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
