import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
import {MainContentComponent} from './components/main-content/main-content.component';


@NgModule({
  declarations: [ SidenavComponent, ToolbarComponent, MainContentComponent],
  imports: [
    CommonModule
  ]
})
export class DiscussionForumModule { }
