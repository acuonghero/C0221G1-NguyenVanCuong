import {Component, EventEmitter, Input, OnDestroy, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit, OnDestroy {

  private interval: number;
  message = '';
  @Input()
  seconds: number;
  @Output() finish = new EventEmitter<string []>();
  resetNum: number;

  constructor() {
  }

  ngOnInit() {
    this.reset();
  }

  ngOnDestroy() {
  }

  start() {
    this.message = 'Start';
    // clearInterval(this.interval);
    this.countDown();
  }

  clearTimer() {
    clearInterval(this.interval);
  }

  stop() {
    this.message = 'Stop';
    this.clearTimer();
  }

  reset() {
    this.message = 'Reset';
    this.resetNum = this.seconds;
    this.finish.emit([this.message, this.resetNum + '']);
    this.clearTimer();
  }

  private countDown() {
    this.interval = setInterval(() => {
      this.finish.emit([this.message, this.resetNum + '']);
      this.resetNum = this.resetNum - 1;
      if (this.resetNum <= -1) {
        this.stop();
      }
    }, 1000);
  }
}
