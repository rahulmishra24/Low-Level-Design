package org.example.DesignPattern.BuilderPattern.v2;

public class SubwaySandwich {

    public String bread;
    public String veggies;
    public String fillings;
    public String condiments;


    private SubwaySandwich(Builder b ){
        this.bread = b.bread;
        this.veggies = b.veggies;
        this.condiments = b.condiments;
        this.fillings = b.fillings;
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    public static class Builder {
        public String bread;
        public String veggies;
        public String fillings;
        public String condiments;


        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setFillings(String fillings) {
            this.fillings = fillings;
            return this;
        }

        public Builder setVeggies(String veggies) {

            this.veggies = veggies;
            return this;
        }

        public SubwaySandwich build(){
            return new SubwaySandwich(this);
        }
    }
}
