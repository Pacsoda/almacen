import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarTazasComponent } from './listar-tazas.component';

describe('ListarTazasComponent', () => {
  let component: ListarTazasComponent;
  let fixture: ComponentFixture<ListarTazasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarTazasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarTazasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
