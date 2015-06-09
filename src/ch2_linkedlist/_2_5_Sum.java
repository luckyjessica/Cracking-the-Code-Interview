package ch2_linkedlist;

public class _2_5_Sum {
	public static SingleLL Sum(SingleLL list1,SingleLL list2){
		Node curr1 = list1.head;
		SingleLL sumlist = new SingleLL();
		int a=0,b=0,sum=0,i=0,j=0;
		while(curr1!=null){
			a += curr1.getData()*Math.pow(10,i);
			i++;
			curr1 = curr1.getNext();
			System.out.println(a);
		}
		Node curr2 = list2.head;
		while(curr2!=null){
			b += curr2.getData()*Math.pow(10,j);
			j++;
			curr2 = curr2.getNext();
			System.out.println(b);
		}
		System.out.println(sum=a+b);
		while(sum>0){
			sumlist.addfirst(sum%10);
			sum = sum/10;
		}
		return sumlist;
	}
	
	public static SingleLL SumForward(SingleLL list1,SingleLL list2){
		Node curr1 = list1.head;
		Node curr2 = list1.head;
		SingleLL sumlist = new SingleLL();
		int a=0,b=0,sum=0,i=0,j=0;
		while(curr1!=null){
			i++;
			curr1 = curr1.getNext();
		}
		while(curr2!=null){
			i--;
			a += curr2.getData()*Math.pow(10,i);
			curr2 = curr2.getNext();
		}
		System.out.println(a);
		Node curr3 = list2.head;
		Node curr4 = list2.head;
		while(curr3!=null){
			j++;
			curr3 = curr3.getNext();
		}
		while(curr4!=null){
			j--;
			b += curr4.getData()*Math.pow(10,j);
			curr4 = curr4.getNext();
		}
		System.out.println(b);
		System.out.println(sum=a+b);
		while(sum>0){
			sumlist.addfirst(sum%10);
			sum = sum/10;
		}
		return sumlist;
	}
	
	public static SingleLL Sum2 (SingleLL list1,SingleLL list2){
		SingleLL sumlist = new SingleLL();
		Node curr1 = list1.head;
		Node curr2 = list2.head;
		int val=0,carry=0;
		while(curr1!=null || curr2!=null || carry!=0){
			int val1 = 0;
            int val2 = 0;
			if(curr1!=null){
				val1 = curr1.getData();
				curr1 = curr1.getNext();
			}
			if(curr2!=null){
				val2 = curr2.getData();
				curr2 = curr2.getNext();
			}
			int sum = val1+val2+carry;
			val = sum%10;
			carry = sum/10;
			sumlist.addfirst(val);
			System.out.println(sumlist.toString());
		}
		return sumlist;
	}
	
	
	
	
	public static void main(String arg[]){
		SingleLL a = new SingleLL();
		SingleLL b = new SingleLL();

		a.addfirst(9);
		a.addfirst(4);
		a.addfirst(9);
		a.addfirst(8);

		b.addfirst(6);
		b.addfirst(4);
		b.addfirst(6);
		System.out.println(a.toString());
		System.out.println(b.toString());

		System.out.println(Sum2(a,b).toString());
	}
}
