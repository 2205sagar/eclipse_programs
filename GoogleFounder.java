package com.xworkz.constructor;

public class GoogleFounder extends Google {
		String founder;
		String date;
		String software;
		String income;
		int investment;
		public GoogleFounder(){
			System.out.println("No argument constructor");
		}
		public GoogleFounder(String founder,String date,String software,String income,int investment){
			System.out.println("all argument constructor");
			this.founder=founder;
			this.date=date;
			this.software=software;
			this.income=income;
			this.investment=investment;
		}
		@override
		public void maps(){
			System.out.println("maps method");
		}
		@override
		public void chrome(){
			System.out.println("chroome method");
		}
		@override
		public void play(){
			System.out.println("p;ay method");
		}
		@override
		public void game(){
			System.out.println("game method");
		}
		@override
		public void store(){
			System.out.println("store method");
		}
		@override
		public void kids(){
			System.out.println("kids method");
		}
		@override
		public void pay(){
			System.out.println("pay method");
		}
		@override
		public void googlePay(){
			System.out.println("Googlepay method");
		}
		@override
		public void search(){
			System.out.println("search method");
		}
		@override
		public void wikipedia(){
			System.out.println("wikipedia method");
		}
		@override
		public void images(){
			System.out.println("images method");
		}
		@override
		public void video(){
			System.out.println("video method");
		}
		@override
		public void song(){
			System.out.println("song method");
		}
		@override
		public void youtube(){
			System.out.println("youtube method");
		}
		@override
		public void query(){
			System.out.println("query method");
		}
		@override
		public void suggest(){
			System.out.println("suggest method");
		}
		@override
		public void alexa(){
			System.out.println("alexa method");
		}
		@override
		public void assistant(){
			System.out.println("assistant method");
		}
		@override
		public void docs(){
			System.out.println("docs method");
		}
		@override
		public void sheet(){
			System.out.println("sheet method");
		}
	

}
