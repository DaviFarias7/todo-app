import { Router } from '@angular/router';
import { Component } from '@angular/core';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent {

  constructor(private router: Router){}

  ngOnInit(): void {
  }

  cancel(): void {
    this.router.navigate([''])
  }

}
