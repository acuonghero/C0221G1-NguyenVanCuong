import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'exercises';
  number = '';
  msg = '';
  display(event: string[]) {
    this.number = event[1];
    this.msg = event[0];
  }
}
