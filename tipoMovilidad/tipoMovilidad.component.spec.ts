import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { tipoMovilidadComponent } from './tipoMovilidad.component';

describe('tipoMovilidadComponent', () => {
  let component: tipoMovilidadComponent;
  let fixture: ComponentFixture<tipoMovilidadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ tipoMovilidadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(tipoMovilidadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
