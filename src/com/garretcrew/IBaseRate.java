package com.garretcrew;

public interface IBaseRate {
    // Write method that return the base rate
    default double getBaseRate() {
        return 2.5;
    }
}
