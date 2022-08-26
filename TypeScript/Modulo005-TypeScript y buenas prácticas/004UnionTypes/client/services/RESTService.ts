import * as $ from "jquery";

export class RESTService<T> {

    constructor(public url:string) {


    }

    async findAll():Promise<T[]> {

        return $.get(this.url);
    }

}