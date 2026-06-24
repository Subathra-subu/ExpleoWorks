class Person {
    private name: string;
    private address: string;

    constructor(name: string, address: string) {
        this.name = name;
        this.address = address;
    }

    public get_Name(): string {
        return this.name;
    }

    public get_Address(): string {
        return this.address;
    }

    public set_Address(address: string): void {
        this.address = address;
    }

    public toString(): string {
        return `Person[name = ${this.name},address = ${this.address}]`;
    }
}

class Student extends Person {
    private program: string;
    private year: number;
    private fee: number;

    constructor(name: string,address: string,program: string,year: number,fee: number) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public get_Program(): string {
        return this.program;
    }

    public set_Program(program: string): void {
        this.program = program;
    }

    public get_Year(): number {
        return this.year;
    }

    public set_Year(year: number): void {
        this.year = year;
    }

    public get_Fee(): number {
        return this.fee;
    }

    public set_Fee(fee: number): void {
        this.fee = fee;
    }

    public toString(): string {
        return `Student[${super.toString()},program = ${this.program},year = ${this.year},fee = ${this.fee}]`;
    }
}

class Staff extends Person {
    private school: string;
    private pay: number;

    constructor(name: string,address: string,school: string,pay: number){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public get_School(): string {
        return this.school;
    }

    public set_School(school: string): void {
        this.school = school;
    }

    public get_Pay(): number {
        return this.pay;
    }

    public set_Pay(pay: number): void {
        this.pay = pay;
    }

    public toString(): string {
        return `Staff[${super.toString()},school = ${this.school},pay = ${this.pay}]`;
    }
}

let student1 = new Student("Subu","Coimbatore","CSE",3,50000);

console.log(student1.toString());

let staff1 = new Staff("Sham","Salem","KIOT",45000);

console.log(staff1.toString());