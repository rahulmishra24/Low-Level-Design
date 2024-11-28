package org.com.DesignPattern.BuilderPattern.BuilderPattern.v1;

public class SubwaySandwich {

    public String bread;
    public String veggies;
    public String fillings;
    public String condiments;


    public SubwaySandwich(Builder b ){
        this.bread = b.bread;
        this.veggies = b.veggies;
        this.condiments = b.condiments;
        this.fillings = b.fillings;
    }

    public static  Builder getBuilder(){
        return new Builder();
    }


    public static class Builder {
        public String bread;
        public String veggies;
        public String fillings;
        public String condiments;


        public void setBread(String bread) {
            this.bread = bread;
        }

        public void setCondiments(String condiments) {
            this.condiments = condiments;
        }

        public void setFillings(String fillings) {
            this.fillings = fillings;
        }

        public void setVeggies(String veggies) {

         this.veggies = veggies;
        }

        public SubwaySandwich build(){
            return new SubwaySandwich(this);
        }
    }
}