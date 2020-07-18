package com.cost;

	
	
	public class constructionCost {

		
		public void testCost() {
			calculatecost cc = new calculatecost();
			cc.getCost("standard",6,false);
			cc.getCost("highStandard",3,true);
			cc.getCost("aboveStandard",2,true);
			cc.getCost("highStandard",5,false);
		}

	}
