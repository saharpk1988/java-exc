package com.example.spk;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    private NrDeletion nrDeletion;
    private EqualSideArrays equalSideArrays;

    @BeforeEach
    public void setUp(){
        nrDeletion=new NrDeletion();
        equalSideArrays=new EqualSideArrays();
    }



    @Test
    public void numberOfDeletionTest(){
        assertEquals(4,nrDeletion.numberOfDeletion("example"));
        assertEquals(2,nrDeletion.numberOfDeletion("Sahar"));
        assertEquals(0,nrDeletion.numberOfDeletion(null));
        assertEquals(1,nrDeletion.numberOfDeletion("PpppkkKk"));
    }


}