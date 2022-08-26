import { Component, OnInit } from '@angular/core';
import { Persona } from '../persona';

@Component({
  selector: 'app-c2',
  templateUrl: './c2.component.html',
  styleUrls: ['./c2.component.css']
})
export class C2Component implements OnInit {

  listaPersonas:Persona[]=[];

  constructor() { }

  ngOnInit() {

    this.listaPersonas.push(new Persona("pedro","perez",20),new Persona("ana","gomez",30));
  }

}
