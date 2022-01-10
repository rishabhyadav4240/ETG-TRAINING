import { Car } from "./Car";

class Truck extends Car{
    weight:Number;
    getSalePrice(): void {
        if(this.weight >2000){
            var prc = this.regularPrice - (this.regularPrice*.1);
            console.log("saleprice-+"+prc);
        }
        else{
            var prc = this.regularPrice - (this.regularPrice*.2);
            console.log("saleprice-"+prc);
        }
    }
    display(){
        console.log("weight-"+this.weight);
        console.log("regularPrice-"+this.regularPrice);
        console.log("speed-"+this.speed);
        console.log("color-"+this.color);
    }
    
        
    }


var t1 = new Truck();
t1.weight=200;
t1.regularPrice=20000;
t1.speed = 500;
t1.color= "Yellow";

t1.display();
t1.getSalePrice();