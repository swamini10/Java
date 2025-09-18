package com.encapsulationdemo;

public class App {
	Customer cus1 = new Customer();
	Customer cus2 = new Customer();
	Customer cus3 = new Customer();
	Customer cus4 = new Customer();
	Customer cus5 = new Customer();
	
	public void setData() {
		cus1.Id = "PIS-39858047" ;
		cus1.name = "Frances Gullefant";
		cus1.sentiment = "Neutral";
		cus1.CastScore = 8;
		cus1.timestamp = "01-01-2024";
		cus1.reason = "Billing Question";
		cus1.city = "Charleston";
		cus1.state = "West Virginia";
		cus1.channel = "Chatbot";
		cus1.res_time = "Within SLA";
		cus1.callduration = 14;
		cus1.callcenter = "Chicago/IL";
		
		cus2.Id = "ROH-40287216" ;
		cus2.name = "Harcourt Zoanetti";
		cus2.sentiment = "Negative";
		cus2.CastScore = 5;
		cus2.timestamp = "01-01-2024";
		cus2.reason = "Billing Question";
		cus2.city = "Honolulu";
		cus2.state = "Hawaii";
		cus2.channel = "Call-Center";
		cus2.res_time = "Within SLA";
		cus2.callduration = 32;
		cus2.callcenter = "Los Angeles/CA";
		
		cus3.Id = "NKC-39578431" ;
		cus3.name = "Washington Oxteby";
		cus3.sentiment = "Negative";
		cus3.CastScore = 3;
		cus3.timestamp = "02-01-2024";
		cus3.reason = "Billing Question";
		cus3.city = "Dallas";
		cus3.state = "Texas";
		cus3.channel = "Chatbot";
		cus3.res_time = "Within SLA";
		cus3.callduration = 6;
		cus3.callcenter = "Denver/CO";
		
		cus4.Id = "APY-17008648" ;
		cus4.name = "Rafe Duffitt";
		cus4.sentiment = "Very Negative";
		cus4.CastScore = 4;
		cus4.timestamp = "02-01-2024";
		cus4.reason = "Billing Question";
		cus4.city = "Fort Myers";
		cus4.state = "Florida";
		cus4.channel = "Email";
		cus4.res_time = "Below SLA";
		cus4.callduration = 26;
		cus4.callcenter = "Los Angeles/CA";
		
		cus5.Id = "MHK-38443501" ;
		cus5.name = "Tris Bent";
		cus5.sentiment = "Positive";
		cus5.CastScore = 8;
		cus5.timestamp = "02-01-2024";
		cus5.reason = "Billing Question";
		cus5.city = "Tuscaloosa";
		cus5.state = "Alabama";
		cus5.channel = "Web";
		cus5.res_time = "Within SLA";
		cus5.callduration = 26;
		cus5.callcenter = "Los Angeles/CA";
		
	}
	
	public void getData() {
		System.out.println("Id:" +cus1.Id);
		System.out.println("Name:" +cus1.name );
		System.out.println("Sentiment:"+cus1.sentiment);
		System.out.println("CSAT Score: "+cus1.CastScore);
		System.out.println("Call Timestamp:"+cus1.timestamp);
		System.out.println("Reason:"+cus1.reason);
		System.out.println("City:"+cus1.city);
		System.out.println("State:"+cus1.state);
		System.out.println("Channel:"+cus1.channel);
		System.out.println("Response Time:"+cus1.res_time);
		System.out.println("Call Duration:"+cus1.callduration);
		System.out.println("Call Center:"+cus1.callcenter);
		
		System.out.println("________________________________________");
		
		System.out.println("Id:" +cus2.Id);
		System.out.println("Name:" +cus2.name );
		System.out.println("Sentiment:"+cus2.sentiment);
		System.out.println("CSAT Score: "+cus2.CastScore);
		System.out.println("Call Timestamp:"+cus2.timestamp);
		System.out.println("Reason:"+cus2.reason);
		System.out.println("City:"+cus2.city);
		System.out.println("State:"+cus2.state);
		System.out.println("Channel:"+cus2.channel);
		System.out.println("Response Time:"+cus2.res_time);
		System.out.println("Call Duration:"+cus2.callduration);
		System.out.println("Call Center:"+cus2.callcenter);
		System.out.println("________________________________________");
		
		System.out.println("Id:" +cus3.Id);
		System.out.println("Name:" +cus3.name );
		System.out.println("Sentiment:"+cus3.sentiment);
		System.out.println("CSAT Score: "+cus3.CastScore);
		System.out.println("Call Timestamp:"+cus3.timestamp);
		System.out.println("Reason:"+cus3.reason);
		System.out.println("City:"+cus3.city);
		System.out.println("State:"+cus3.state);
		System.out.println("Channel:"+cus3.channel);
		System.out.println("Response Time:"+cus3.res_time);
		System.out.println("Call Duration:"+cus3.callduration);
		System.out.println("Call Center:"+cus3.callcenter);		System.out.println("________________________________________");
		
		System.out.println("Id:" +cus4.Id);
		System.out.println("Name:" +cus4.name );
		System.out.println("Sentiment:"+cus4.sentiment);
		System.out.println("CSAT Score: "+cus4.CastScore);
		System.out.println("Call Timestamp:"+cus4.timestamp);
		System.out.println("Reason:"+cus4.reason);
		System.out.println("City:"+cus4.city);
		System.out.println("State:"+cus4.state);
		System.out.println("Channel:"+cus4.channel);
		System.out.println("Response Time:"+cus4.res_time);
		System.out.println("Call Duration:"+cus4.callduration);
		System.out.println("Call Center:"+cus4.callcenter);
		System.out.println("________________________________________");
		
		System.out.println("Id:" +cus5.Id);
		System.out.println("Name:" +cus5.name );
		System.out.println("Sentiment:"+cus5.sentiment);
		System.out.println("CSAT Score: "+cus5.CastScore);
		System.out.println("Call Timestamp:"+cus5.timestamp);
		System.out.println("Reason:"+cus5.reason);
		System.out.println("City:"+cus5.city);
		System.out.println("State:"+cus5.state);
		System.out.println("Channel:"+cus5.channel);
		System.out.println("Response Time:"+cus5.res_time);
		System.out.println("Call Duration:"+cus5.callduration);
		System.out.println("Call Center:"+cus5.callcenter);
	}
}
