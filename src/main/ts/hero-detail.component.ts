import { Component, Input } from '@angular/core';
import {Hero} from "./hero";
import {HeroService} from "./hero.service";

@Component({
    selector: 'my-hero-detail',
    template: `
  <div *ngIf="hero">
    <h2>{{hero.name}} details!</h2>
    <div><label>id: </label>{{hero.id}}</div>
    <div>
      <label>name: </label>
      <input [(ngModel)]="hero.name" placeholder="name" (ngModelChange)="onChange($event)"/>
    </div>
  </div>
`,
})
export class HeroDetailComponent {
    @Input()
    hero: Hero;

    constructor(private heroService: HeroService) {

    }

    onChange(e: Event) {
        this.heroService.updateHero(this.hero);
    }
}