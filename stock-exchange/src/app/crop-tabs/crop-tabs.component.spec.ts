import { fakeAsync, ComponentFixture, TestBed } from '@angular/core/testing';
import { CropTabsComponent } from './crop-tabs.component';

describe('CropTabsComponent', () => {
  let component: CropTabsComponent;
  let fixture: ComponentFixture<CropTabsComponent>;

  beforeEach(fakeAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ CropTabsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CropTabsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
