import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, CanActivate, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { JwtTokenService } from './servicio/jwt-token.service';

@Injectable({
  providedIn: 'root'
})
export class AutenticacionGuard implements CanActivate  {


  constructor(private router:Router,private jwtTokenService:JwtTokenService) {

    
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
   

    if(this.jwtTokenService.token) {

      return true;
    }


    this.router.navigate(["login"]);
    return false;
  }
  
}
