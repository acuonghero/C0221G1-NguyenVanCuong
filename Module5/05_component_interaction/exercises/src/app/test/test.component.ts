import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  // count = 5;
  // @Output()
  // CountChange: EventEmitter<number> = new EventEmitter<number>();
  //
  // increment(){
  //   this.count++;
  //   this.CountChange.emit(this.count);
  // }
  //
  // decrement(){
  //   this.count--;
  //   this.CountChange.emit(this.count);
  // }

  count = 0;

  increment(){
    this.count ++;
  }
  decrement(){
    this.count--;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
