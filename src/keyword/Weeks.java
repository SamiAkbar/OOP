package keyword;

public class Weeks {
    Months month;
    public Weeks(Months month) {
    	this.month = month;
    	
    }
    
    public void WhatToDo() {
    	switch(month) {
    	case January: System.out.println("i likw snoq in january");break;
    	case Febrarury: System.out.println("febrarury is a good month to me");break;
    	case March: System.out.println("1 March is my brother birthday");break;
    	case April: System.out.println("weather is good in april");break;
    	case May: System.out.println("weather starts to change in may");break;
    	case June: System.out.println("june comes in summer");break;
    	case July: System.out.println("full hot month");break;
    	case August: System.out.println("1 august is my happy birthday");break;
    	case september: System.out.println("weather start change");break;
    	case October: System.out.println("i love october");break;
    	case November: System.out.println("starts winter");break;
    	case December: System.out.println("full cold and lovely month");break;
		
    	
    	}
    }
}
