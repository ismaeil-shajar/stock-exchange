import { NgModule } from '@angular/core';

import { WelcomeRoutingModule } from './welcome-routing.module';

import { WelcomeComponent } from './welcome.component';
import { CropTableComponent } from '../../crop-table/crop-table.component';
import { CropTabsComponent } from '../../crop-tabs/crop-tabs.component';
import { NzTableModule } from 'ng-zorro-antd/table';
import { NzTabsModule } from 'ng-zorro-antd/tabs';
import { CommonModule } from '@angular/common';
import { NzCardModule } from 'ng-zorro-antd/card';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzAvatarModule } from 'ng-zorro-antd/avatar';
import { NzGridModule } from 'ng-zorro-antd/grid';

@NgModule({
  imports: [WelcomeRoutingModule,
    NzTableModule,
    NzAvatarModule,
    NzGridModule,
    NzTabsModule, CommonModule, NzCardModule, NzLayoutModule ],
  declarations: [WelcomeComponent, CropTableComponent, CropTabsComponent],
  exports: [WelcomeComponent]
})
export class WelcomeModule { }
