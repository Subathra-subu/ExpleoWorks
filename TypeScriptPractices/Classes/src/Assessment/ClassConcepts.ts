class Person{
    private name:string;
    private address:string;

    constructor(name:string,address:string){
        this.name=name;
        this.address=address;
    }

    public get_Name():string{
        return this.name;
    }
}