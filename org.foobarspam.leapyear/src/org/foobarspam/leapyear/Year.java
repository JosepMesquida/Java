/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.leapyear;

/**
 *
 * @author Josep Mesquida
 * 
 * 
 */

public class Year {

	private int year = 0;
	
	public Year(int year){
		this.year = year;		
	}
	
	public int getYear(){
		return this.year;
	}
	
        
	public Boolean isLeap(){
		return getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0;
        }
        
}

