import { Component, OnInit } from '@angular/core';
import { Persona } from '../persona';

@Component({
  selector: 'app-c1',
  templateUrl: './c1.component.html',
  styleUrls: ['./c1.component.css']
})
export class C1Component implements OnInit {

  nombre:string="pedro";
  paisaje:string="assets/paisaje1.jpg";
  contador:number=0;
  persona:Persona;


  constructor() { }

  ngOnInit() {

    this.persona=new Persona("pedro","perez",25);
  }

  incrementar(){

    this.contador++;
  }

  decrementar(){

    this.contador--;
  }

}
