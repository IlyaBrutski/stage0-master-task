package com.epam.OOP;

public class Dog extends Animal {
    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public String getDescription(){
        return "This animal is mostly " + this.getColor() + ". It has " + this.getNumberOfPaws() + " " + (this.getNumberOfPaws() > 1 ? "paws" : "paw") + " and " + (this.isHasFur() ? "a" : "no") + " fur.";
    }
}
