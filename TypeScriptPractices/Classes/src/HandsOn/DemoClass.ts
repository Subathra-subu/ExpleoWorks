class car{
    public brand:String;
    private speed:number;
    private fuel:String;

    constructor(brand:string,speed:number,fuel:string){
        this.brand=brand;
        this.speed=speed;
        this.fuel=fuel;
    }

    public accelerate(){
        this.speed+=10;
        console.log(`Accelerating to ${this.speed} km/hr`);
    }

    private refuel(){
        console.log(`Refueling with ${this.fuel}`);
    }

    protected honk(){
        console.log(`Honk,Honk!!!`);
    }

    public displayCarInfo(){
        console.log(`Brand: ${this.brand}`);

        console.log(`Speed: ${this.speed}`);

        console.log(`Fuel: ${this.fuel}`);
        this.refuel();
        this.honk();
    }

}

let myCar = new car("Toyota",60,"Gasoline");

console.log(`Brand: ${myCar.brand}`);
myCar.accelerate();

// console.log(myCar.speed);
// myCar.refuel();
// myCar.honk();


myCar.displayCarInfo();