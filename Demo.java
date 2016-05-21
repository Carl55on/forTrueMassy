package ua.khpi.kotov.task02;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new Demo();
		MyListImpl con = new MyListImpl();
		
		
		con.add("A");
		con.add("B");
		con.add(888);
		con.add(demo);
		
		


		System.out.println(con);
		
		//con.clear();
		//System.out.println(con);
		
		con.remove(888);
		System.out.println(con);
		
		System.out.println(con.size());
		
		System.out.println(con.contains("C"));
				
		con.add(4333);
		System.out.println(con);
		System.out.println(con.size());
		//System.out.println(con.size());
		//System.out.println(con);
		//con.clear();
		//System.out.println(con.size());
		
		
		
		MyListImpl c = new MyListImpl();
		
		//c.clear();
		
		c.add("A");
		c.add("B");
		c.add("A");
		c.add("A");
		c.add("C");
		//c.add("C");
		//c.add("Y");
		//c.add("C");
		
		
		System.out.println("-----------------CONTAINSALL---------------");
		System.out.println("c="+c);
		System.out.println("con="+con);
		System.out.println(con.containsAll(c));
		con.add("C");
		System.out.println("add C to con");
		System.out.println("c="+c);
		System.out.println("con="+con);
		System.out.println(con.containsAll(c));
		System.out.println("-----------------CONTAINSALL---------------");
		System.out.println(c.containsAll(con));
		c.add(4333);
		c.add(demo);
		System.out.println("c="+c);
		System.out.println("con="+con);
		System.out.println(c.containsAll(con));
		c.remove("C");
		System.out.println("c="+c);
		c.remove("D");
		System.out.println("c="+c);
	}
	

}
