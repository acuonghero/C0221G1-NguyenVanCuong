import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculation',
  templateUrl: './calculation.component.html',
  styleUrls: ['./calculation.component.css']
})
export class CalculationComponent implements OnInit {
  result = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  public Calculation(num1: string, num2: string, cal: string): void {
    const number1: number = parseInt(num1);
    const number2: number = parseInt(num2);
    switch (cal) {
      case '+':
       this.result = number1 + number2;
       break;
      case '-':
        this.result = number1 - number2;
        break;
      case '*':
        this.result = number1 * number2;
        break;
      case '/':
        this.result = number1 / number2;
        break;
    }
  }
}
