import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-angular-color-picker-app',
  templateUrl: './angular-color-picker-app.component.html',
  styleUrls: ['./angular-color-picker-app.component.css']
})
export class AngularColorPickerAppComponent implements OnInit {
   red = 0 ;
   green = 0 ;
   blue = 0 ;
  constructor() { }

  ngOnInit(): void {
  }
}
