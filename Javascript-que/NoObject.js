/* function vehicle(vname,model,driver) {
    this.vname = vname,
        this.model = model,
        this.driver = driver;
}
let Car = new vehicle("Lamborgini", "2018", "Mounika")
console.log(Car.vname);
console.log(Car.driver)
console.log(Car.model); */


/* let user={
    name:"Gagan",
    age:24,
    education:"BSc Computers"
}
console.log(user.name);
console.log(user.age)
console.log(user.education) */


function apply1(){
    isStudying:false,
    edu = function (){
        console.log(`My name is ${this.name} is studing?:${this.isStudying}`)
    }
}

let me=Object.create(apply1)
me.name="gagan";
me.isStudying=true,
me.edu