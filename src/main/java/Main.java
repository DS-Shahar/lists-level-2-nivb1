class Main {
  public static Node<Integer> q1(Node<Integer> a, Node<Integer> b){
		Node<Integer> head = new Node<Integer>(-1);
		Node<Integer> save = head;
		while(a!=null && b!=null) {
			if(a.getValue()<b.getValue()) {
				head.setNext(a);
				head = head.getNext();
				a = a.getNext();
				}
			else if(a.getValue()>b.getValue()) {
					head.setNext(b);
					head = head.getNext();
					b = b.getNext();
				}
			else {
				head.setNext(b);
				head = head.getNext();
				b = b.getNext();
				head.setNext(a);
				head = head.getNext();
				a = a.getNext();
			}
		}
		if(a==null) {
			head.setNext(b);
			return save.getNext();
		}
		else {
			head.setNext(a);
			return save.getNext();
		}
		
	}
	public static Node<Integer> q2(Node<Integer> a){
		Node<Integer>  head = new Node<Integer>(0);
		Node<Integer> save = head;
		Node<Integer> s = a;
		while (a!=null) {
			int min = a.getValue();
			a = a.getNext();
			while(a!=null) {
				if(a.getValue()<min)
					min = a.getValue();
				a =a.getNext();
					
			}
			
			a = s;
			if(s.getValue()==min) {
				head.setNext(s);
				head = head.getNext();
				s =s.getNext();
				
			}
			else {
				while(a.getNext().getValue()!=min) {
				a =a.getNext();
			}
				head.setNext(a.getNext());
				head = head.getNext();
				a.setNext(a.getNext().getNext());
			}
			
			a=s;
			
		}
		return save.getNext();
	}
	public static int q3(Node<Integer> a, int n) {
		int count = 0;
		int sum=0;
		Node<Integer> s = a;
		while(a!=null) {
			if(a.getValue()==n) {
				sum+=count;
				a=null;
			}
			else {
			count++;
			a=a.getNext();}
		}
		if (sum==0)
			return -1;
		a=s;
		count=0;
		while(a!=null) {
			if(a.getValue()==n)
				count++;
			a=a.getNext();
		}
		a=s;
		for(int i=0;i<count;i++) {
			while(a.getValue()!=n) {
				a=a.getNext();
			}
			if(i!=count-1)
				a=a.getNext();
		}
		count=0;
		while(a.hasNext()) {
			a=a.getNext();
			count++;
		}
		return count+sum;
		
	}
	public static boolean q4(Node<Integer> a) {
		Node<Integer> s = a;
		Node<Integer> g = a;
		while(a!=null) {
			g=a.getNext();
			while(g!=null) {
				if(a.getValue()==g.getValue()) {
					return false;
				}
				g = g.getNext();
					
			}
			a=a.getNext();
		}
		return true;
	}
	public static Node<Integer> q5(Node<Integer> a){
		Node<Integer> s = a;
		Node<Integer> g = a;
		while(a!=null) {
			g=a;
			while(g.hasNext()) {
				if(a.getValue()==g.getNext().getValue()) {
					g.setNext(g.getNext().getNext());
				}
				else {
					g=g.getNext();
				}
			}
			a=a.getNext();
		}
		return s;
	}
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
