import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { ConhecimentoPage } from './conhecimento.page';

describe('ConhecimentoPage', () => {
  let component: ConhecimentoPage;
  let fixture: ComponentFixture<ConhecimentoPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConhecimentoPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(ConhecimentoPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
