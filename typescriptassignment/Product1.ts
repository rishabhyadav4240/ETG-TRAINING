class Product1{
    proid:number;
    proname:string;
    proprice:number;

    additionalTax(){
        var taxProPrice = (this.proprice * 0.12)+this.proprice;
        console.log(taxProPrice);
    }
   
    display(){
        console.log(this.proid);
        console.log(this.proname);
        console.log(this.proprice);
        
    }
}

var pro1=new Product1();
pro1.proid=123;
pro1.proname="macbook";
pro1.proprice=2000;

pro1.display();
pro1.additionalTax();