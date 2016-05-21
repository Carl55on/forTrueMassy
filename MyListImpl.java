package ua.khpi.kotov.task02;

public class MyListImpl implements MyList{
	
	@Override
	public String toString() {
		String out="";
		for(int i=0;i<mas.length;i++){
			out+="["+mas[i]+"]";
		}
		return out;
	}


	MyListImpl(){
				
	}
	
	Object[] mas;
	int massize;
	

	@Override
	public void add(Object e) {
		massize++;
		Object[] newmas= new Object[massize];
		for(int i=0;i<massize-1;i++){
		newmas[i]=mas[i];
		}
		newmas[massize-1]=e;
		mas=newmas;
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		Object[] clearmas=new Object[0];
		mas=clearmas;
		massize=0;
	}

	@Override
	public boolean remove(Object o) { 
		// TODO Auto-generated method stub
				int temp=-1;
				boolean da=false;
		for(int i=massize-1;i>-1;i--){
			if (mas[i].equals(o)){temp=i;da=true;}
			}
		
		int razmer=massize;
		if (da){massize--;}
		
		Object[] newmas= new Object[massize];
		int y=0;
		for(int i=0;i<razmer;i++){
			newmas[y]=mas[i];y++;
			if(i==temp){y--;}
		}
		mas=newmas;
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
				
		return mas;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return massize;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		boolean da=false;
		for(int i=massize-1;i>-1;i--){
			if (mas[i].equals(o)){da=true;}
			}
		return da;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		
		Object[] masc=c.toArray();
		
		//if(masc.length>mas.length){return false;}
				
		
		boolean da=false;
		
		int temp=0;
		int value=0;
		
		
		for(int i=0;i<masc.length;i++){
			
			for(int y=0;y<mas.length;y++){
				if(mas[y].equals(masc[i])){
					da=true;
					value++;
					break;}
			}
			if(value==temp){return false;}
			else{temp++;}
		}

		return da;
	}

}
