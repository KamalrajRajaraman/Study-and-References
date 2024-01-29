package colpack;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class MyStreamDemo3 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
        //Adding Products
        items.add(new Item(1,"mango",200));
        items.add(new Item(2,"apple",100));
        items.add(new Item(3,"pineapple",180));
        items.add(new Item(4,"jack",350));
        items.add(new Item(5,"grapes",60));
        List<Float> mylist=new ArrayList<>();
        for(Item i:items) {
        	if(i.price<=200) {
        		mylist.add(i.price);
        		if(mylist.size()==2) {
        			break;
        		}
        	}
        }
        System.out.println(mylist);
        mylist=items.stream().filter((i)->i.price<=200).limit(2).map((i)->i.price).collect(Collectors.toList());
        System.out.println(mylist);
     }
}
class Item{
	int id;String name;float price;
	public Item(int sno,String name,float price) {
		this.id=id;this.name=name;this.price=price;
	}
	public float getPrice() {
		return this.price;
	}
}