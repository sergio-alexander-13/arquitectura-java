import { Component, OnInit } from '@angular/core';
import { Persona } from '../persona';

@Component({
  selector: 'app-c4',
  templateUrl: './c4.component.html',
  styleUrls: ['./c4.component.css']
})
export class C4Component implements OnInit {

  seleccionada:Persona;

  listaPersonas:Persona[]=[];

  constructor() { }

  ngOnInit() {

    this.listaPersonas.push(new Persona("pedro","perez",20,false,"java"),new Persona("ana","gomez",30,true,"java"));
    this.listaPersonas.push(new Persona("juan","sanchez",50,true,"c#"),new Persona("david","perez",60,false,"python"))
  }

  seleccionarPersona(persona:Persona):void {

    this.seleccionada=persona;
  }
}
