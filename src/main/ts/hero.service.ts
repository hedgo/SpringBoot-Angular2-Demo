import { Injectable } from '@angular/core';
import {Hero} from "./hero";
import { Http, Response } from '@angular/http';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class HeroService {

    constructor(private http: Http) { }

    getHeroes(): Promise<Hero[]> {
        return this.http.get('/rest/hero/all')
            .toPromise()
            .then(res => res.json() as Hero[]);
    }

    updateHero(hero: Hero): Promise<Response> {
        return this.http.put("/rest/hero", hero).toPromise();
    }
}