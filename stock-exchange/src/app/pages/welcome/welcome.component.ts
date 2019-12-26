import { Component, OnInit, HostListener } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  scrolling: boolean;
  constructor() {
    this.scrolling = false;
  }
  ngOnInit() {
  }

}
