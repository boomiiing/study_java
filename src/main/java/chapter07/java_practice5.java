package chapter07;

public class java_practice5 {
    public static void main(String[] args) {
        Goods goods1 = new Thephone("iphone",8999,"512");
        Goods goods2 = new Book("book",89,"xxx");
        goods1.showInfo();
        goods2.showInfo();
    }
}


//需求：商店商品
//父类 Goods
//私有属性：商品名 name，价格 price
//构造方法、get/set
//方法 showInfo() 打印商品信息
//子类 Phone 继承 Goods，新增属性：内存 memory
//重写 showInfo，输出商品名、价格、内存
//子类 Book 继承 Goods，新增属性：作者 author
//重写 showInfo，输出商品名、价格、作者
//测试：用多态形式创建 Phone 和 Book 对象，调用 showInfo
//考察点：封装 + 继承 + 重写 + 多态综合


class Goods{
    String name;
    int price;
    public Goods(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println(name+"价格:"+price);
    }
}

class Thephone extends Goods{
    String memory;
   public Thephone(String name, int price,String memory){
       super(name, price);
       this.memory = memory;
   }
   public void showInfo(){
       System.out.println(super.name + super.price + this.memory);
   }
}

class Book extends Goods{
    String author;
    public Book(String name, int price,String author){
        super(name, price);
        this.author = author;
    }
    public void showInfo(){
        System.out.println(super.name + super.price + this.author);
    }
}
