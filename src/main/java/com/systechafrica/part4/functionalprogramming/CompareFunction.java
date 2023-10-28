package com.systechafrica.part4.functionalprogramming;


@FunctionalInterface
public interface CompareFunction<T, P, R> {
    // T - first argument
    // P - second argument
    // R -return type
    R compare(T t, P p);
    
} 
