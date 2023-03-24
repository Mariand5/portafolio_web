import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  persona: persona = new persona("","","");
  //PersonaService hace referencia al typescript modificado en service
  constructor(public personaService: PersonaService) {}
  //subscribe conecta el observable con evetos, metodo que obtiene la información que fue modificada por el observable
  //cuando cambie la condición se va a guardar en data, el subscribe escucha el data y lo pasa al service, el service lo pasa al backend
  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona = data})
  }
}