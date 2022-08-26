import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtTokenService {

  //simplemente le uso como si fuera una session
  token:string;

  constructor() { }
}
