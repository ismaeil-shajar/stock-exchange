import { fakeAsync, ComponentFixture, TestBed } from '@angular/core/testing';
import { CropTableComponent } from './crop-table.component';

describe('CropTableComponent', () => {
  let component: CropTableComponent;
  let fixture: ComponentFixture<CropTableComponent>;

  beforeEach(fakeAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ CropTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CropTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
