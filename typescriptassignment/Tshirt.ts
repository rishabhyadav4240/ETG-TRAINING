class Tshirt{
    color:string;
    material:string;
    design:string;
    size:string;

    constructor(s:string,c:string,  m:string,d:string){
         this.size = s;
        this.material = m;
        this.design = d;
        this.color = c;
        
    }
    display(){
        console.log("\nSize - " + this.size );
        console.log("Material - " + this.material ); 
        console.log("Design - "  + this.design  );
         console.log("Color - " + this.color);
    }
}

var t1 = new Tshirt("small","red","cotton","round-neck");
var t2 = new Tshirt("large","yellow","lenin","V-neck");
var t3 = new Tshirt("Extra-large","blue","cotton","round-neck");

t1.display();
t2.display();
t3.display();