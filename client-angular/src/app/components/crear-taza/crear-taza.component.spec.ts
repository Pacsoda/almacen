import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrearTazaComponent } from './crear-taza.component';

describe('CrearTazaComponent', () => {
  let component: CrearTazaComponent;
  let fixture: ComponentFixture<CrearTazaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrearTazaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CrearTazaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
